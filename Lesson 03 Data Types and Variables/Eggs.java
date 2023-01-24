/**
 * This program computes the price of eggs
 *
 * @author Alex Jihong Kim
 */
public class Eggs {
	/**
	 * Starts the program.
	 *
	 * @param args
	 *	          command line arguments
	 */  
	public static void main(String[] args) {
		
		// Computes number of eggs in dozen and rest
		// Calculates price of eggs
		int numberOfEgg = 27;
		int eggInDozen = numberOfEgg / 12;
		int eggIndividual = numberOfEgg % 12;
		double priceOfDozen = 3.25 * eggInDozen;
		double priceOfIndividual = 0.45 * eggIndividual;
		double totalPrice = priceOfDozen + priceOfIndividual;
		
		// Outputs the result to user
		System.out.println("You ordered " + numberOfEgg + " eggs. That's "
						   + eggInDozen + " dozen at $3.25 per dozen and "
						   + eggIndividual + " loose eggs at 45 cents each "
						   + "for a total of $" + totalPrice + ".");
	}
}
