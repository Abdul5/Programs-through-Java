import java.util.*;
public class MinOprToMakeEqualOneAndTwoNum {
	        public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int result = solve(a, b);
	        System.out.println("Minimum number of operations: " + result);
	        }

	    public static int solve(int a, int b) {
	        int count = 0;
	        while (a != b) {
	            if (a > b) {
	                a = a & b;
	            } else {
	                b = b & a;
	            }
	            count++;
	        }
	        return count;
	    }
}
