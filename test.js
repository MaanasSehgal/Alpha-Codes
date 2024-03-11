const contestIds = [1918, 1920]; // Array of contest IDs
const count = 5; // Count of participants

const fetchContestData = async (contestId) => {
    const response = await fetch(`https://codeforces.com/api/contest.standings?contestId=${contestId}&count=${count}`);
    if (!response.ok) {
        throw new Error(`Failed to fetch data for contest ID ${contestId}`);
    }
    return response.json();
};

Promise.all(contestIds.map(fetchContestData))
    .then((results) => {
        const combinedResults = results.flatMap((data) => data.result.rows);
        combinedResults.sort((a, b) => b.points - a.points);

        const result = {
            contestNames: results.map((data) => data.result.contest.name),
            participants: [],
            numberOfParticipants: combinedResults.length,
        };

        let rank = 1;
        let prevPoints = -1;
        combinedResults.forEach((row, index) => {
            if (row.points !== prevPoints) {
                rank = index + 1;
            }
            const participant = {
                username: row.party.members[0].handle,
                rank,
                points: row.points,
                solvedCount: row.problemResults.filter((problem) => problem.points > 0).length,
            };
            result.participants.push(participant);
            prevPoints = row.points;
        });
        console.log(result);
    })
    .catch((error) => console.error("Error fetching leaderboard data:", error));
