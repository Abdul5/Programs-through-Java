import java.util.*;
public class ProdAndSum {
	    private static final int MOD = 1000000007; // 10^9 + 7
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int q = sc.nextInt();
	        if (q == 1) {
	            System.out.println(sum(n));
	        } else if (q == 2) {
	            System.out.println(product(n));
	        } else {
	            System.out.println("Invalid query!");
	        }
	        sc.close();
	    }
	    
	    private static int sum(int n) {
	        long s = (long) n * (n + 1) / 2; // use long to avoid overflow
	        return (int) (s % MOD);
	    }
	    
	    private static int product(int n) {
	        long p = 1;
	        for (int i = 1; i <= n; i++) {
	            p = (p * i) % MOD;
	        }
	        return (int) p;
	    }
}
