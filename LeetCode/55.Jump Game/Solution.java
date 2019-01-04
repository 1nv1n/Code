import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Contains the logic that solves the provided problem.
 */
class Solution {
	public boolean canJump(int[] input) {
		return true;
	}
}

/**
 * Driver class for the problem's solution (JDK8+).
 */
public class MainClass {
	private static String currTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	private static int[] jumpInput1 = new int[]{2,3,1,1,4};
	private static int[] jumpInput2 = new int[]{3,2,1,0,4};

	public static void main(String[] args) {
		System.out.println(currTimeStamp);
		
		Solution sol = new Solution();
		System.out.println(sol.canJump(jumpInput1));
		System.out.println(sol.canJump(jumpInput2));
	}
}