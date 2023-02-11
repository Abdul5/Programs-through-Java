import java.util.*;

	class Soln{
	     public static int maxConsecutiveOnes(int[] arr, int n) {
	        // Your code here
		int maxCount = 0;
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	      if (arr[i] == 1) {
	        count++;
	      } else {
	        maxCount = Math.max(maxCount, count);
	        count = 0;
	      }
	    }
	    maxCount = Math.max(maxCount, count);
	    return maxCount;
		 }
	}

	public class MaxConsecutiveOnesCount {

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        Soln obj = new Soln();
	        System.out.println(obj.maxConsecutiveOnes(arr, n));
	    }

}
