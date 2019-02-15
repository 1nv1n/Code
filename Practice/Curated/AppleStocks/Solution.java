/**
 * Class that contains the logic & implementation for the provided problem's solution.
 */
class CodeGoesHere {

  /**
   * Get the maximum profit from the provided stock prices
   * stockPrices - int array
   */
  public static int getMaxProfit(int[] stockPrices) {
    int minPrice = stockPrices[0];
    int maxProfit = 0;

    for (int currentPrice : stockPrices) {
        // Ensure minPrice is the lowest price we've seen so far
        minPrice = Math.min(minPrice, currentPrice);

        // See what our profit would be if we:
        //  bought at the min price and sold at the current price
        int potentialProfit = currentPrice - minPrice;

        // Update maxProfit if we can do better
        maxProfit = Math.max(maxProfit, potentialProfit);
    }

    return maxProfit;
  }
}

/**
 * This is the driver of the solution.
 * This class is not expected to hold any logic,
 *  but rather to call into the method(s) from {@link CodeGoesHere} to perform the expected actions.
 */
public class Solution {
  /**
   * The entry point to executing the solution.
   * @param args {@link String} argument array from the standard input.
   */
  public static void main(String[] args) {
    // Create a new instance of the class that implements the logic.
    CodeGoesHere cGH = new CodeGoesHere();
      int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};

    // Print the expected output to the standard output.
    System.out.println(cGH.getMaxProfit(stockPrices));
  }
}