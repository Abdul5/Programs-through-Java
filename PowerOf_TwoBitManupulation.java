import java.util.*;
public class PowerOf_TwoBitManupulation {
		public static boolean isPowerOfTwo(int n) {
	        //Write your code here
			return n > 0 && (n & n - 1) == 0;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        System.out.println(isPowerOfTwo(n));
	    }
}


//Any Number which is comes equals to the power of Two is true other wise false
