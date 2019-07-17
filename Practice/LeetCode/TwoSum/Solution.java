import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * Solution Implementor.
 */
class CodeGoesHere {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> complementMap;

    // Input validation
    if(nums == null || nums.length <= 0) {
      throw new IllegalArgumentException("Invalid input!");
    } else {
      complementMap = new HashMap<>(nums.length);
    }

    // Visit every element
    for(int nIdx = 0; nIdx < nums.length; nIdx++) {
      int complement = target - nums[nIdx];

      // Check if the number's complement exists
      if(complementMap.containsKey(complement) && complementMap.get(complement) != nIdx) {
        return new int[]{complementMap.get(complement), nIdx};
      }

      complementMap.put(nums[nIdx], nIdx);
    }

    throw new IllegalStateException("No Two Sum Solution!");
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
    System.out.println(Arrays.toString(cGH.twoSum(new int[]{2, 7, 11, 15}, 9)));
  }
}