import java.util.*;
public class Check_Square_Rectangle_Quardilateral {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the lengths of the four sides
	        int side1 = scanner.nextInt();
	        int side2 = scanner.nextInt();
	        int side3 = scanner.nextInt();
	        int side4 = scanner.nextInt();

	        // Check if it's a square
	        if (side1 == side2 && side2 == side3 && side3 == side4) {
	            System.out.println("square");
	        }
	        // Check if it's a rectangle
	        else if ((side1 == side3 && side2 == side4) || (side1 == side2 && side3 == side4) || (side1 == side4 && side2 == side3)) {
	            System.out.println("rectangle");
	        }
	        // It's a quadrilateral
	        else {
	            System.out.println("quadrilateral");
	        }

	        scanner.close();
	    }
}
