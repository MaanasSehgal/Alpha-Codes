import java.util.*;

public class MaxLengthChainOfPairs {

    public static void main(String[] args) {
        int start[] = { 5, 39, 5, 27, 50 };
        int end[] = { 24, 60, 28, 40, 90 };

        int chain[][] = new int[start.length][3];

        //0: idx
        //1: start
        //2: end

        for (int i = 0; i < chain.length; i++) {
            chain[i][0] = i;
            chain[i][1] = start[i];
            chain[i][2] = end[i];
        }

        Arrays.sort(chain, Comparator.comparingDouble(o -> o[2]));

        int lastEnd = chain[0][2];
        int maxLength = 1;

        ArrayList<Integer> pairs = new ArrayList<>();
        pairs.add(chain[0][0]);

        for (int i = 1; i < chain.length; i++) {
            //if nextstart >= lastend
            if (chain[i][1] >= lastEnd) {
                pairs.add(chain[i][0]);
                lastEnd = chain[i][2];
                maxLength++;
            }
        }

        System.out.println("Max length of chain: " + maxLength);
        System.out.println("Activities chosen: ");

        for (int el : pairs) {
            System.out.println("Pair " + el + " ");
        }
    }
}
