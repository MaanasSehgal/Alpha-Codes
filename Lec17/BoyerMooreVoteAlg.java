public class BoyerMooreVoteAlg {

    public static int maxVote(int arr[]) {
        int vote = 0;
        int candidate = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (vote == 0) {
                candidate = arr[i];
            }
            vote += (arr[i] == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 4, 4, 2, 2, 3, 2, 2, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 2, 2, 2, 2 };
        System.out.println(maxVote(arr));
    }
}
