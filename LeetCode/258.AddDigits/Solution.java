class Solution {
    public int addDigits(int num) {
      // Base case: Number less than or equal to zero
      if(num <= 0) {
        return 0;
      }
      
      // If single digit, return as-is
      if(num <= 9) {
        return num;
      }
      
      // Initialize inputs for the loop
      int sum = num;
      String input = "";
      do {
        // String representation of the current sum, start with the input
        input = String.valueOf(sum);
        sum = 0;
        
        // Iterate over each character to get the total sum
        for(int idx = 0; idx < input.length(); idx++) {
          sum += Character.getNumericValue(input.charAt(idx));
        }
      } while(sum > 9); // Repeat till we get to a single ditit
      
      return sum;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            int ret = new Solution().addDigits(num);
            
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }
}
