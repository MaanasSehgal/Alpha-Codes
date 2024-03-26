

public class buyAndSellStocks {

    public static void main(String[] args) {
        int stocks[] = { 3, 1, 2, 4, 5, 10 };
        int n = stocks.length;

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currPrice = stocks[i];

            if (currPrice < buyPrice) {
                buyPrice = currPrice;
            } else {
                int profit = currPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.println("Max profit: " + maxProfit);
    }
}
