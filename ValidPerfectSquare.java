import java.util.*;
public class ValidPerfectSquare {
	    public static String validatePerfectSquare(int n) {
	        if (n < 0) {
	            return "NO"; // Negative numbers are not perfect squares
	        }

	        long left = 0;
	        long right = n;

	        while (left <= right) {
	            long mid = left + (right - left) / 2;
	            long square = mid * mid;

	            if (square == n) {
	                return "YES";
	            } else if (square < n) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return "NO";
	    }

	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(validatePerfectSquare(n)); // Output: YES
	    }
}

/*
 input :
 16
 
 Output :
 YES
 
 Input2:
 14
 
 Output2:
 NO
 
 */
