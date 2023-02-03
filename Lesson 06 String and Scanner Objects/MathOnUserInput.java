/**
 * This program ask user to input integers
 * and will display sum, average, min, max of integers
 * @author Alex Jihong Kim
 */
import java.util.Scanner;

public class MathOnUserInput {
    
    /**
     * Starts the program.
     * 
     * @param args command line arguments
     */ 
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("How many integers?: ");
        double numInt = console.nextInt();  // double for float division during avg calculation
        
        System.out.print("First interger?: ");
        int integer = console.nextInt();
        int sum = integer;
        int min = integer;
        int max = integer;
        
        for (int i = 1; i < numInt; i++) {
            System.out.print("Next integer?: ");
            integer = console.nextInt();
            sum += integer;
            min = Math.min(min, integer);
            max = Math.max(max, integer);
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / numInt);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        
        console.close();
    }
    
}
