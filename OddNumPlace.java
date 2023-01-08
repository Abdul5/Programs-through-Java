import java.util.*;
public class OddNumPlace {
		public static void main(String args[]) {
			
			solve();
		}

		public static void solve()
		{
			// Your code here
			Scanner sc = new Scanner(System.in);
			int c = 0;
			int n = sc.nextInt();
			c++;
			while(n % 2 == 0) {
				n = sc.nextInt();
			    c++;
			}
			System.out.println(c);
		}

}
