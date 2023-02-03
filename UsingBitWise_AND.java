import java.util.*;
public class UsingBitWise_AND {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long a = sc.nextLong();
	        long b = sc.nextLong();
	        long result = a;
	        for (long i = a + 1; i <= b; i++) {
	            result &= i;
	        }
	        System.out.println(result);
	    }
}
