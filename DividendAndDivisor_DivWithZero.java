import java.util.*;
class Solution {
	    public int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            return Integer.MAX_VALUE;
	        }
	        if (dividend == Integer.MIN_VALUE && divisor == -1) {
	            return Integer.MAX_VALUE;
	        }
	        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
	        long a = Math.abs((long)dividend);
	        long b = Math.abs((long)divisor);
	        int quotient = 0;
	        for (int i = 31; i >= 0; i--) {
	            if ((a >> i) >= b) {
	                quotient += 1 << i;
	                a -= b << i;
	            }
	        }
	        return isNegative ? -quotient : quotient;
	    }
	}

public class DividendAndDivisor_DivWithZero {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		    
		    	int A = sc.nextInt();
				int B = sc.nextInt();
	            Solution Obj = new Solution();
				System.out.println(Obj.divide(A,B));
	    }
}
