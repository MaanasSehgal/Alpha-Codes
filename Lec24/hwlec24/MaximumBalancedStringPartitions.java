package hwlec24;

public class MaximumBalancedStringPartitions {

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        int partitions = 0;
        int balance = 0;

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            //L -> +1  R -> -1
            if (currChar == 'L') {
                balance++;
            } else if (currChar == 'R') {
                balance--;
            }

            if (balance == 0) {
                partitions++;
            }
        }

        System.out.println("Total number of partitions: " + partitions);
    }
}
