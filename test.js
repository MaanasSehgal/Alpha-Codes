const fileNames = ["res1.json", "res2.json"];

const fetchContestData = async (fileName) => {
    const response = await fetch(`http://127.0.0.1:5500/res1.json`);
    if (!response.ok) {
        throw new Error(`Failed to fetch data for file ${fileName}`);
    }
    return response.json();
};

Promise.all(fileNames.map(fetchContestData))
    .then((results) => {
        let combinedUserMap = {};
        let contestNames = [];
        let result = {
            contestNames,
            participants: [],
        };

        results.forEach((data, index) => {
            const contestName = data.result.contest.name;
            contestNames.push(contestName);

            data.result.rows.forEach((row) => {
                const userId = row.party.members[0].handle; // Use a unique identifier if available
                if (!(userId in combinedUserMap)) {
                    combinedUserMap[userId] = {
                        username: row.party.members[0].handle, // Include username for reference
                        points1: 0,
                        points2: 0,
                        questionCount1: 0,
                        questionCount2: 0,
                        solvedCount: 0,
                        totalPoints: 0,
                        penalty1: 0,
                        penalty2: 0,
                        finalPenalty: 0,
                    };
                }
                combinedUserMap[userId][`points${index + 1}`] += row.points;
                combinedUserMap[userId][`questionCount${index + 1}`] += row.problemResults.filter((problem) => problem.points > 0).length;
                combinedUserMap[userId].solvedCount += row.problemResults.filter((problem) => problem.points > 0).length;
                combinedUserMap[userId].totalPoints += row.points;
                combinedUserMap[userId][`penalty${index + 1}`] = row.penalty;
                combinedUserMap[userId].finalPenalty += row.penalty;
            });
        });

        const combinedResults = Object.values(combinedUserMap);
        combinedResults.sort((a, b) => {
            if (a.finalPenalty !== b.finalPenalty) {
                return a.finalPenalty - b.finalPenalty;
            } else {
                if (a.solvedCount !== b.solvedCount) {
                    return b.solvedCount - a.solvedCount; // Sort by solved count if penalties are the same
                } else {
                    return a.username.localeCompare(b.username); // If both are still tied, sort by username
                }
            }
        });

        let rank = 0;
        let prevPenalty = -1;
        let prevSolvedCount = -1;
        combinedResults.forEach((participant) => {
            if (participant.finalPenalty !== prevPenalty || participant.solvedCount !== prevSolvedCount) {
                rank++;
            }
            participant.rank = rank;
            prevPenalty = participant.finalPenalty;
            prevSolvedCount = participant.solvedCount;
        });

        result.participants = combinedResults;

        console.log(result);
    })
    .catch((error) => console.error("Error fetching leaderboard data:", error));
