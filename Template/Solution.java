/**
 * Contains the entry point of the solution.
 */
class Solution {
}

/**
 * Driver class for the problem's solution.
 */
public class MainClass {
  private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

  public static void main(String[] args) throws IOException {
    System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
  }
}