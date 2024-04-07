package hwlec24;

public class LexiographicallySmallestString {

    public static void main(String[] args) {
        int N = 5, K = 25;
        int arr[] = new int[N];

        //initialize each value with 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        int currSum = K - N;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (currSum >= 26) {
                arr[i] = 26;
                currSum -= 25; //because 1 is already set
            } else {
                arr[i] = currSum + 1;
                currSum = 0;
                break;
            }
        }

        if (currSum == 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < arr.length; i++) {
                sb.append((char) (arr[i] + 96));
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("Invalid input");
        }
    }
}
