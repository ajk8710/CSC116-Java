/**
 * Methods in class calculate area for various shapes.
 * 
 * @author Alex Jihong Kim
 */
public class MyAreaCalculations {
    /**
     * The method that is executed when the program is run
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(triangleArea(8, 5.2, 7.1));      // EXPECTED OUTPUT: 18.151176098258745
        System.out.println(triangleArea(3.0, 4.0, 5));      // EXPECTED OUTPUT: 6.0
        System.out.println(cylinderSurfaceArea(3.0, 4.5));  // EXPECTED OUTPUT: 141.3716694115407
        System.out.println(cylinderSurfaceArea(5, 5));      // EXPECTED OUTPUT: 314.1592653589793
    }

    /**
     * Returns the area of a triangle with given side lengths
     * 
     * @param sideA first side of triangle
     * @param sideB second side of triangle
     * @param sideC third side of triangle
     * @return
     */
    public static double triangleArea(double sideA, double sideB, double sideC) {
        // Heron's formula:
        // Area = Square root of s * (s - a) * (s - b) * (s - c) where s is half the perimeter, or (a + b + c) / 2
        double sValue = (sideA + sideB + sideC) / 2;
    	double area = Math.sqrt(sValue * (sValue - sideA) * (sValue - sideB) * (sValue - sideC));
    	return area;
    }

    /**
     * Returns the surface area of a cylinder with the given radius and height
     * 
     * @param radius radius of cylinder
     * @param height height of cylinder
     * @return surface area of cylinder with radius and height
     */
    public static double cylinderSurfaceArea(double radius, double height) {
        // Surface area of cylinder: (2 * pi * r * h) + (2 * pi * r^2)
        double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
}
