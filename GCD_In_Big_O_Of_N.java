import java.util.*;
public class GCD_In_Big_O_Of_N {
	public static long gcd(long m, long n) {
        //Write your code here
		long Temp, GCD=0;  
      while(n != 0)  
       {  
         Temp = n;  
         n = m % n;  
         m = Temp;  
       }  
         GCD = m;  
         return GCD; 
    }
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    long m = sc.nextLong();
        long n = sc.nextLong();
        System.out.print(gcd(m, n));
	}

}
