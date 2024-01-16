package Lec9;

public class buyAndSellStocks {

  public static int calculateMaxProfit(int prices[]) {
    int n = prices.length;
    int currProfit = 0, maxProfit = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        // System.out.print("(" + prices[i] + ", " + prices[j] + "), ");
        currProfit = prices[j] - prices[i];
        if (currProfit > 0 && currProfit > maxProfit) {
          maxProfit = currProfit;
        }
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = { 3, 2, 1, 9, 10, 13 };

    int maxProfit = calculateMaxProfit(prices);
    System.out.println("Maximum profit possible: " + maxProfit);
  }
}
