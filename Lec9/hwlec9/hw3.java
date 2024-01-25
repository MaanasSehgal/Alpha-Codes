package Lec9.hwlec9;

public class hw3 {

    public static int calculateMaxProfit(int prices[]) {
        int n = prices.length;

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int currPrice = prices[i];
            if (buyPrice < currPrice) {
                int currProfit = currPrice - buyPrice;

                maxProfit = Math.max(currProfit, maxProfit);
            } else {
                buyPrice = currPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        int prices[] = {7, 6, 4, 3, 1};

        int maxProfit = calculateMaxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
