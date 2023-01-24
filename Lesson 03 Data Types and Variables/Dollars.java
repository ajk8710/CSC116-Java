/**
 * This program computes dollars in each bill - 20s, 10s, 5s, and 1s
 *
 * @author Alex Jihong Kim
 */
public class Dollars {
	/**
	 * Starts the program.
	 *
	 * @param args
	 *	          command line arguments
	 */  
	public static void main(String[] args) {
		
		// Divides dollar amount to each bill
		int dollarAmount = 57;
		int twentyBill = dollarAmount / 20;
		int tenBill = dollarAmount % 20 / 10;
		int fiveBill = dollarAmount % 20 % 10 / 5;
		int oneBill = dollarAmount % 20 % 10 % 5;
		
		// Outputs result to user
		System.out.println("$" + dollarAmount + " converts to: "
						   + twentyBill + " 20s, " + tenBill + " 10s, "
						   + fiveBill + " 5s, and " + oneBill + " 1s.");
	}
}
