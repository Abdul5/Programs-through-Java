import java.util.*;
public class CalcNCR {

	    static long calculate_nCr(int n, int r) {
	        // write code here
			return fact(n) / (fact(r) * fact(n - r));
	    }
		static long fact(int n)
	{
	      if(n==0)
	      return 1;
	    long res = 1;
	    for (int i = 2; i <= n; i++)
	        res = res * i;
	    return res;
	}
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int r = scanner.nextInt();
	        long ans = calculate_nCr(n,r);
	        System.out.print(ans);
	    }

}
