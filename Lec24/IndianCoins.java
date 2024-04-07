import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        ArrayList<Integer> givenMoney = new ArrayList<>();

        int change = 594;

        int i = coins.length - 1;
        int minCoinCount = 0;

        while (i >= 0 && change != 0) {
            if (change >= coins[i]) {
                while (change >= coins[i]) {
                    change -= coins[i];
                    minCoinCount++;
                    givenMoney.add(coins[i]);
                }
            }

            i--;
        }

        if (change != 0) {
            System.out.println("The supply couldn't be completed");
        } else {
            System.out.println("The minimum amount of coins: " + minCoinCount + " and they were supplied as: ");
            for (int coin : givenMoney) {
                System.out.print(coin + " ");
            }
        }
    }
}
