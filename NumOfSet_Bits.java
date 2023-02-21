import java.util.*;

	    public class NumOfSet_Bits {

	    public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(setBits(n));
	    }
	    public static int setBits(int n) {
	        // write code here
			int cnt= 0;
			while(n!=0){
				cnt++;
				n = (n & (n-1));
			}
			return cnt;
	    }

}
