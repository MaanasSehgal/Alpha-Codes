
public class tillingProblem {

    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        System.out.print("Vertical: " + n + " ");
        int fnm1 = tiling(n - 1);
        System.out.print("Horizontal: " + n + " ");
        int fnm2 = tiling(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("Answer: " + tiling(n));
    }
}
