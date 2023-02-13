import java.util.*;
public class CheckRange {
	    public static boolean RangeCheck(int[][] intervals, int a, int b) {
	        // Write your code here
			boolean[] isCovered = new boolean[51];
	        for (int i = 0; i < intervals.length; i++) {
	            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
	                isCovered[j] = true;
	            }
	        }

	        for (int i = a; i <= b; i++) {
	            if (!isCovered[i]) {
	                return false;
	            }
	        }

	        return true;

	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n =sc.nextInt();
	        int[][] intervals = new int[n][2];
	        for(int i = 0; i < n; i++) {
	            intervals[i][0] = sc.nextInt();
	            intervals[i][1] = sc.nextInt();
	        }
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        if(RangeCheck(intervals, a, b))
	            System.out.println("true");
	        else
	            System.out.println("false");
	    }
}
