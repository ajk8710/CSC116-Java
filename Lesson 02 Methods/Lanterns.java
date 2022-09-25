/**
 * This program draws lantern shape figure.
 *
 * @author Alex Jihong Kim
 */
 public class Lanterns {
	 /**
	  * Starts the program.
	  *
	  * @param args command line arguments
	  */
	 public static void main(String[] args) {
		 triangles();
		 System.out.println();
		 triangles();
		 blocks();
		 System.out.println("*************");
		 triangles();
		 System.out.println();
		 triangles();
		 lines();
		 blocks();
		 blocks();
		 lines();
		 lines();
	 }	 
	 
	 /**
	  * Draws triangle figure.
	  */
	 public static void triangles() {
		 System.out.println("    *****");
		 System.out.println("  *********");
		 System.out.println("*************");
	 }
	 
	 /**
	  * Draws block shape figure.
	  */
	 public static void blocks() {
		 System.out.println("* | | | | | *");
	 }
	 
	 /**
	  * Draws line shape figure.
	  */
	 public static void lines() {
		 System.out.println("    *****");
	 }
	 
 }
 