import java.util.Stack;

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

public class SolutionDriver {
  public static void main(String[] args) {
    CodeGoesHere cGH = new CodeGoesHere();
    System.out.println(cGH.isValid("([)}"));
  }
}