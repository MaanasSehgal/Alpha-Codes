package Lec9;

public class optimizedBuyAndSellStocks {

  public static int calculateMaxProfit(int prices[]) {
    int n = prices.length;
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < n; i++) {
      //if there is any profit
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice; //today's profit
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = { 3, 1, 2, 4, 5, 10 };

    int maxProfit = calculateMaxProfit(prices);
    System.out.println("Maximum profit possible: " + maxProfit);
  }
}
