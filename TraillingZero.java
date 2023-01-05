import java.util.*;
public class TraillingZero {
	public static int TRAILINGZEROES(int n){
        // write code here
		if (n < 0) // Negative Number Edge Case
            return -1;
 
        // Initialize result
        int count = 0;
 
        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
 
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=TRAILINGZEROES(n);
        System.out.println(ans);
    }

}
