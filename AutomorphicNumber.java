import java.util.*;
public class AutomorphicNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        long square = n * n;
	        long original = n;
	        boolean isAutomorphic = true;
	        while (n > 0) {
	            if (n % 10 != square % 10) {
	                isAutomorphic = false;
	                break;
	            }
	            n /= 10;
	            square /= 10;
	        }
	        if (isAutomorphic) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }
	    }
}
// number is automorphic if we do square of the num after square we find last digit of square is same as original num
/*
input :
6
output :
1
*/