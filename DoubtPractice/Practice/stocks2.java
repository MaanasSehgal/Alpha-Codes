package Practice;
public class stocks2 {

    public static int calculateMaxProfit(int stockData[]) {
        int n = stockData.length;

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int currPrice = stockData[i];

            if (buyPrice < currPrice) {
                int currProfit = currPrice - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                buyPrice = stockData[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int stockData[] = { 3, 5, 2, 1, 6, 3, 7, 2, 3, 1 };

        int maxProfit = calculateMaxProfit(stockData);
        System.out.print(maxProfit);
    }
}
