import java.util.Stack;

/**
 * Class that contains the logic & implementation for the provided problem's solution.
 */
class CodeGoesHere {
  public boolean isValid(String s) {
    Stack<Character> charStack = new Stack<Character>();

    // Base case
    if(null == s) {
      return false;
    }

    for(char c : s.toCharArray()) {
      if(c == '(' || c == '[' || c == '{') {
        charStack.push(c);
      } else if(c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
        charStack.pop();
      } else if(c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
        charStack.pop();
      } else if(c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
        charStack.pop();
      } else {
        return false;
      }
    }

    return charStack.isEmpty();
  }
}

/**
 * This is the driver of the solution.
 * This class is not expected to hold any logic,
 *  but rather to call into the method(s) from {@link CodeGoesHere} to perform the expected actions.
 */
public class Solution {
  public static void main(String[] args) {
    CodeGoesHere cGH = new CodeGoesHere();
    System.out.println(cGH.isValid("([)}"));
  }
}