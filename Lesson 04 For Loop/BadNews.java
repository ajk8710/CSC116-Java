/**
 * Prelab 4B Question 1
 *
 * @author Alex Jihong Kim
 */
public class BadNews {
    public static final int MAX_ODD = 21;

    public static void writeOdds() {
        // print each odd number
    	System.out.print(1);
        for (int count = 3; count <= MAX_ODD; count += 2) {
            System.out.print(" " + count);
        }
    }

    public static void main(String[] args) {
        // write all odds up to 21
        writeOdds();
    }
    
}
