package Practice;

public class stocks {

  public static void main(String[] args) {
    int prices[] = { 5, 3, 6, 4, 1, 8, 3, 9 };

    int n = prices.length;

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < n; i++) {
      int currPrice = prices[i];

      //profit
      if (buyPrice < currPrice) {
        int profit = currPrice - buyPrice;

        maxProfit = Math.max(maxProfit, profit);
      } else {
        //loss, then update buy price
        buyPrice = currPrice;
      }
    }

    System.out.println("Maximum profit of this will be: " + maxProfit);
  }
}
