/**
 * Solution Implementor.
 */
class CodeGoesHere {
  /**
   * Get the maximum profit from the provided stock prices.
   * @param stockPrices - int array
   */
  public static int getMaxProfit(int[] stockPrices) {
    // Assume a low minimum
    int minPrice = -1;

    // Assume the maximum starting profit to be 0.
    int maxProfit = 0;

    // Base case, return on invalid input
    if(stockPrices == null || stockPrices.length <= 0) {
      return maxProfit;
    }

    // Set the minimum price to be the first day's stock price.
    minPrice = stockPrices[0];

    // Look at every available stock price
    for (int currentPrice : stockPrices) {
        // Ensure minPrice is the lowest price we've seen so far
        minPrice = Math.min(minPrice, currentPrice);

        // See what our profit would be if we bought at the min price and sold at the current price
        int potentialProfit = currentPrice - minPrice;

        // Update maxProfit if we can do better
        maxProfit = Math.max(maxProfit, potentialProfit);
    }

    return maxProfit;
  }
}

/**
 * Driver.
 */
public class Solution {
  /**
   * Entry point.
   * @param args {@link String} argument array from the standard input.
   */
  public static void main(String[] args) {
    CodeGoesHere cGH = new CodeGoesHere();
    int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};

    System.out.println(cGH.getMaxProfit(stockPrices));
  }
}