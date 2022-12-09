import java.util.*;
public class NoOfWaysToSumOfTargetEleUsingRecur {
	public static long ways(int n, int i){
		//Write your code here
				if(n == 0) return 1;
				if(i > n) return 0;
				if(n < 0) return 0;
				long NoWaysUsingI = ways(n - i,i + 1);
				long NoWaysUsingWithOutI = ways(n,i + 1);
				return NoWaysUsingI + NoWaysUsingWithOutI;
		    }
		    public static void main(String args[]) {
		        Scanner input = new Scanner(System.in);
		        int n = input.nextInt();
		        System.out.println(ways(n, 1));
		    }

}
