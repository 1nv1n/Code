import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Contains the logic that solves the provided problem.
 */
class Solution {
	// List containing indexes of possible jumps, in reverse order
	private List<Integer> jumpList = null;
	
	public boolean canJump(int[] input) {
		// Base case (empty array)
		if(input.length <= 0) {
			return false;
		}

		// Base case (single element array)
		if(input.length == 1) {
			return true;
		}

		// Set the initial current & target indexes.
		int currIdx = input.length-2;
		int targetIdx = input[input.length-1];

		// Initialize & set the jumpList's last jump.
		jumpList = new ArrayList<Integer>(input.length);
		jumpList.add(input[input.length-1]);
		
		// Loop from the second-to-the-last array index
		// decerementing till we're down to the 0th array index.
		while(currIdx >= 0) {
			// Check whether we can reach the target index from the current index.
			if(currIdx + input[currIdx] >= targetIdx) {
				// If we can sucessfully jump from the current index to the target index,
				// Add the current index to the jumpList (so we know that there is a path from this index to the target index)
				// Set the current index to be the target index for the next run.
				jumpList.add(currIdx);
				targetIdx = currIdx;
			}

			// Next loop for the index before the current index.
			currIdx--;
		}

		// Check the status of our jumpList
		System.out.println("Jump Indexes in Reverse:"+jumpList);

		// If we have the start index in the jumpList
		//  it means that we can sucessfully go from the start index
		//  to the end index.
		if(jumpList.get(jumpList.size()-1) == 0) {
			return true;
		}

		return false;
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