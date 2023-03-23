import java.util.*;
public class DiamondStarPatternCodingNinjas {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        int midRow = (rows + 1) / 2;

	        for (int i = 1; i <= rows; i++) {
	            if (i <= midRow) {
	                for (int j = 1; j <= midRow - i; j++) {
	                    System.out.print("  "); // here i print 2 space
	                }
	                for (int k = 1; k <= 2 * i - 1; k++) {
	                    System.out.print("* ");
	                }
	            } else {
	                for (int j = 1; j <= i - midRow; j++) {
	                    System.out.print("  "); // here i also print 2 space
	                }
	                for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
	                    System.out.print("* ");
	                }
	            }
	            System.out.println();
	        }
	    }
}

/*
 
 Enter the number of rows: 5
  *
 ***
*****
 ***
  *

*/
