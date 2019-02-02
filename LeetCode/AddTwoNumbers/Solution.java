import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
* Definition for singly-linked list.
*/
class ListNode {
	int val;
	ListNode next;

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}

	/* Constructs a ListNode with the provided value */
	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	/* Prints the current node & all the nodes it is linked to. */
	public void printLinkedList() {
		StringBuilder linkedListStrBuilder = new StringBuilder();
		ListNode curNode = this;

		if(this == null) {
			System.out.println("null");
		}

		linkedListStrBuilder.append(curNode.val);
		curNode = curNode.next;
		
		while(curNode != null) {
			linkedListStrBuilder.append(" -> ");
			linkedListStrBuilder.append(curNode.val);
			curNode = curNode.next;
		}

		System.out.println(linkedListStrBuilder.toString());
	}
}

/**
 * Contains the logic that solves the provided problem.
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode tempNode = null;
		int sum = 0;
		int carry = 0;

		// Base case, both inputs are null
		if(null == l1 && null == l2) {
			return result;
		}
		// Base case, one of the inputs is null
		if(null == l1) {
			return l2;
		} else if(null == l2) {
			return l1;
		}

		// Loop till we exhaust both inputs
		while(l1 != null || l2 != null) {
			// Calculate positional sum
			if(null == l1) {
				sum = l2.val + carry;
			} else if(null == l2) {
				sum = l1.val + carry;
			} else {
				sum = l1.val + l2.val + carry;
			}

			// Detect carry
			if(sum > 9) {
				carry = sum / 10; // Determine carry-over
				sum %= 10;        // Determine positional sum
			} else {
				carry = 0;
			}

			// Set current node
			if(null == result) {
				result = new ListNode(sum);
				tempNode = result;
			} else {
				while(tempNode.next != null) {
					tempNode = tempNode.next;
				}
				tempNode.next = new ListNode(sum);
			}

			// Move to the next node
			if(null != l1) {
				l1 = l1.next;
			}
			if(null != l2) {
				l2 = l2.next;
			}
		}

		return result;
	}
}

/**
 * Driver class for the problem's solution (JDK8+).
 */
public class MainClass {
	private static String currTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	public static void main(String[] args) {
		System.out.println(currTimeStamp);

		Solution sol = new Solution();
		ListNode res = null;

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		// Extra test
		// l2.next.next.next = new ListNode(9);

		res = sol.addTwoNumbers(l1, l2);

		// Uncomment to print the inputs & the outpu
		// l1.printLinkedList();
		// l2.printLinkedList();
		res.printLinkedList();
	}
}