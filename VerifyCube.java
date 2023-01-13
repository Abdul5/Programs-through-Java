import java.util.*;
public class VerifyCube {
		public static void main (String[] args) throws java.lang.Exception
		{
			//your code here
	                Scanner sc = new Scanner(System.in);
	                long a = sc.nextLong();
	                long b = sc.nextLong();
	                long res = (a+b)*(a+b)*(a+b);
	                long res1 = (a*a*a) + (b*b*b) + ((3*(a*a))*b) + ((3*a)*(b*b));
	                if(res == res1) {
	                        System.out.println(res);
	                        System.out.println(res1);
	                        System.out.println("VERIFIED");
	                }
	                else {
	                        System.out.println("NOT VERIFIED");
	                }
		}

}
