import java.util.*;
public class MultiplicationTableOf_N {
	public static void solve(int n)
	   {
	        //write your code here
		   for(int i = 1;i <= 10;i++) {
			   System.out.println(i*n);
		   }
	   }
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);        
		    int n=s.nextInt();
	        solve(n);
		}

}
