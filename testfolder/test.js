const fileNames = ["res1.json", "res2.json"];

const fetchContestData = async (contestId) => {
    const response = await fetch(`http://127.0.0.1:5500/${contestId}`);
    if (!response.ok) {
        throw new Error(`Failed to fetch data for contest ID ${contestId}`);
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
                const username = row.party.members[0].handle;
                if (!(username in combinedUserMap)) {
                    combinedUserMap[username] = {
                        username,
                        points1: 0,
                        points2: 0,
                        questionCount1: 0,
                        questionCount2: 0,
                        solvedCount: 0,
                        totalPoints: 0,
                    };
                }
                combinedUserMap[username][`points${index + 1}`] += row.points;
                combinedUserMap[username][`questionCount${index + 1}`] += row.problemResults.filter((problem) => problem.points > 0).length;
                combinedUserMap[username].solvedCount += row.problemResults.filter((problem) => problem.points > 0).length;
                combinedUserMap[username].totalPoints += row.points;
            });
        });

        const combinedResults = Object.values(combinedUserMap);
        combinedResults.sort((a, b) => {
            if (b.totalPoints !== a.totalPoints) {
                return b.totalPoints - a.totalPoints;
            } else {
                return a.username.localeCompare(b.username);
            }
        });

        let prevPoints = -1;
        combinedResults.forEach((participant, index) => {
            if (participant.totalPoints !== prevPoints) {
                rank = index + 1;
            }
            participant.rank = rank;
            prevPoints = participant.totalPoints;
        });

        result.participants = combinedResults;

        console.log(result);
    })
    .catch((error) => console.error("Error fetching leaderboard data:", error));
