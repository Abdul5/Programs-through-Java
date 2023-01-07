import java.util.*;
public class CalcNPR {
	  
	  public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	   static int fact(int n)
	    {
	        if (n <= 1)
	            return 1;
	        return n * fact(n - 1);
	    }
	   public static int getValueInBase(int n, int r){
	    // Your code here
		   return fact(n) / fact(n - r);
	   }

}
