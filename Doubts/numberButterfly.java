public class numberButterfly {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            //left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            //spaces
            for (int j = 2 * n - i; j > i; j--) {
                System.out.print("  ");
            }

            //right stars
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            //left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            //spaces
            for (int j = 2 * n - i; j > i; j--) {
                System.out.print("  ");
            }

            //right stars
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
