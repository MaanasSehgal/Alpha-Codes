public class rowChangePattern {

    public static void main(String args[]) {
        int n = 18;
        int printNum = 0;
        int i = 0;

        //Complete rows
        for (i = 1; i <= n / 5; i++) {
            if (i % 2 != 0) { //odd
                for (int j = printNum + 1; j <= printNum + 5; j++) {
                    System.out.print(j + " ");
                }
            } else { //even
                for (int j = printNum + 5; j > printNum; j--) {
                    System.out.print(j + " ");
                }
            }
            printNum += 5;
            System.out.println();
        }
        if (i % 2 != 0) { //odd
            for (int j = printNum; j <= n; j++) {
                System.out.print(j + " ");
            }
        } else {
            for (int j = n; j > printNum; j--) {
                System.out.print(j + " ");
            }
        }
    }
}
