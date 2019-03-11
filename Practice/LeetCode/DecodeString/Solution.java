import java.util.Stack;

/**
 * Solution Implementor.
 */
class CodeGoesHere {
  public String decodeString(String s) {
    StringBuilder outputBuilder = new StringBuilder();
    Stack<Integer> numStack = new Stack<Integer>();
    Stack<String> strStack = new Stack<String>();

    // Base case, input validity
    if(s == null || s.length() <= 0) {
      return outputBuilder.toString();
    }

    // Base case, no brackets
    if(!s.contains("[") && !s.contains("]")) {
      return s;
    }

    /*
      Loop over each character & if a digit is encountered,
        Compute the entire number (multi-digit)
        Add the number to the number stack
      If an opening bracket is encountered,
        Push the current output into the String stack.
      If a closing bracket is encountered,
        Pop the last from the number stack.
        Pop the last from the String stack.
        Append the popped String to the current String the popped number of times.
        Set this String to the output string.
      Else, add the current character to the output String.
    */
    for(int sIdx = 0; sIdx < s.length(); sIdx++) {
      if(Character.isDigit(s.charAt(sIdx))) {
        int times = Character.getNumericValue(s.charAt(sIdx));
        while(((sIdx+1) < s.length()) && Character.isDigit(s.charAt(sIdx+1))) {
          times = (times*10) + Character.getNumericValue(s.charAt(sIdx+1));
          sIdx++;
        }
        numStack.push(times);
      } else if(s.charAt(sIdx) == '[') {
        strStack.push(outputBuilder.toString());
        outputBuilder = new StringBuilder();
      } else if(s.charAt(sIdx) == ']') {
        StringBuilder intermediateBuilder = new StringBuilder(strStack.pop());
        int times = numStack.pop();
        for(int tIdx = 0; tIdx < times; tIdx++) {
          intermediateBuilder.append(outputBuilder.toString());
        }
        outputBuilder = new StringBuilder(intermediateBuilder.toString());
      } else {
        outputBuilder.append(s.charAt(sIdx));
      }
    }

    return outputBuilder.toString();
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
    String input = "3[a]2[bc]";
    // input = "3[a2[c]]";
    // input = "2[abc]3[cd]ef";
    input = "100[leetcode]";
    System.out.println(cGH.decodeString(input));
  }
}
