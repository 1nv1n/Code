import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Contains the loigc that solves the provided problem.
 */
class Solution {

}

/**
 * Driver class for the problem's solution (JDK8+).
 */
public class MainClass {
	private static String currTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	public static void main(String[] args) {
		System.out.println(currTimeStamp);
	}
}