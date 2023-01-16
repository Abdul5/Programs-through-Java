import java.util.*;
public class CountDigit_7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(count7(n));
	        sc.close();
	    }

	    public static int count7(int n) {
	        // your code here
			int c = 0;
			while(n > 0) {
				if(n % 10 == 7) {
					c++;
				}
				n /= 10;
			}
			return c;
	    }

}
