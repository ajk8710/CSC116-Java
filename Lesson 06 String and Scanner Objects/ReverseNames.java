/**
 * This program prompts user to input full name as "first last"
 * and program shows reversed name as "last, first"
 * 
 * @author Alex Jihong Kim
 */
import java.util.Scanner;
public class ReverseNames {

    /**
     * Starts the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter your first and last name: ");
        String first = console.next();
        String last = console.next();
        
        System.out.print("Your name in reverse order is: " + last + ", " + first);
        
        console.close();
    }
    
}
