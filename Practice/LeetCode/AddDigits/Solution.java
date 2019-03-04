/**
 * Solution Implementor.
 */
class CodeGoesHere {
  /**
  * Returns the sum of the digits in the given number in constant time.
  */
  public int addDigitsConstantTime(int num) {
    // Base case, if the number is lesser than 10 or invalid (negative); just return it.
    if(num < 10) {
      return num;
    }

    // Math magic for constant time digit-add
    return num % 9 == 0 ? 9 : num % 9;
  }

  /**
  * Returns the sum of the digits in the given number.
  */
  public int addDigits(int num) {
    // Assume a minimal sum
    int sum = 0;

    // String placeholder
    String sumStr = "";

    // Base case, if the number is lesser than 10 or invalid (negative); return 0.
    if(num < 10) {
      return sum;
    } else {
      sum = num;
    }

    // Keep calculating until the final sum is less than 2 digits
    while(sum > 10) {
      sumStr = Integer.toString(sum);
      sum = 0;

      // Add up every element in the array to re-calculate the sum.
      for(char c : sumStr.toCharArray()) {
        sum += Character.getNumericValue(c);
      }
    }

    return sum;
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
    System.out.println(cGH.addDigits(38));
  }
}
