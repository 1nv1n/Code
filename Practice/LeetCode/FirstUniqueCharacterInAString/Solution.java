import java.util.*;

/**
 * Solution Implementor.
 */
class CodeGoesHere {
  /**
  * Takes a non-null {@link String} & returns the index of the first unique character.
  */
  public int firstUniqueCharacter(String s) {
    Map<Character, Integer> charPosMap;
    int firstUniqueCharIdx;

    // Basic input validity check
    if(s == null || s.length() <= 0) {
      throw new IllegalArgumentException("Input cannot be null!");
    } else {
      charPosMap = new HashMap<>(26);
    }

    // Set each character from the input into the map (character : index).
    // If a repeated character occurence is detected, set the corresponding value to an invalid index.
    for(int sIdx = 0; sIdx < s.length(); sIdx++) {
      if(charPosMap.containsKey(s.charAt(sIdx))) {
        charPosMap.put(s.charAt(sIdx), -1);
      } else {
        charPosMap.put(s.charAt(sIdx), sIdx);
      }
    }

    firstUniqueCharIdx = Integer.MAX_VALUE;
    for(Integer pos : charPosMap.values()) {
      if(pos > -1 && pos < firstUniqueCharIdx) {
        firstUniqueCharIdx = pos;
      }
    }

    return (firstUniqueCharIdx == Integer.MAX_VALUE ? -1 : firstUniqueCharIdx);
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
    System.out.println(cGH.firstUniqueCharacter("leetcodelive"));
  }
}
