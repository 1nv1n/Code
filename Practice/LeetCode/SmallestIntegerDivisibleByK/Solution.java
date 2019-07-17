import java.lang.Math;
import java.util.*;

/**
 * Solution Implementor.
 */
class CodeGoesHere {
  public int calcSmallestDivisor(int k) {
    long n = 1;
    int base = 10;
    Map<Integer, Long> oneMap;

    // Input validation
    if(k <= 0) {
      throw new IllegalArgumentException("Input is not a positive integer.");
    }

    // Base case
    if(k == 1) {
      return 1;
    }

    // If k is divisible by 2 or 5, it cannot be divisible by anything ending in a 1.
    if(k % 2 == 0 || k % 5 == 0) {
      return -1;
    }
    
    oneMap = new HashMap<>(20);
    // This gets us to our first number that's greater than 1 & has all 1s, 11
    // Using Math.pow() to get 10 & adding to it, map.get(0)
    oneMap.put(0, 1L);

    // Recalculate "n" till we hit Long.MAX_VALUE, since we know there can only be a maximum of 19 digits in a 'long'.
    for(int i = 1; i < 19; i++) {
      // The next number to check will be 10^i + whatever makes all digits 1s
      n = (long) Math.pow(base, i) + oneMap.get(i-1);

      // Check if 'n' is divisible by 'k'.
      if(n % k == 0) {
        return i + 1; // Alternative: String.valueOf(n).length();
      }

      // Keep a track of whatever gets us to all digits as 1s.
      oneMap.put(i, n);
    }

    // If the above fails, a simpler approach:
    int i = 0;
    int count = 0;
    while(i <= k) {
      i = (i * 10 + 1) % k;
      count++;
      
      if(i == 0) {
        return count;
      }
    }

    // If we couldn't find anything within the Long.MAX_VALUE range.
    return -1;
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
    System.out.println(cGH.calcSmallestDivisor(23));
  }
}
