import java.util.*;
public class MirrorTrianglePattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rows = sc.nextInt();
	        sc.close();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows-i; j++) {
	                System.out.print("  ");  // Print spaces
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");  // Print asterisks
	            }
	            System.out.println();  // Move to the next line
	        }
	    }
}
