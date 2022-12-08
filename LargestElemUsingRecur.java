import java.util.*;
public class LargestElemUsingRecur {
	    public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] nums = new int[n];
			for (int i = 0; i < n; i++)
			{
				nums[i] = sc.nextInt();
			}
	        int result=maxElement(nums,n);
	        System.out.print(result);
	    }

	    public static int maxElement(int[] arr,int n){
	      //Write your code here
			if (n == 1)
	        return arr[0];
	        return max(maxElement(arr,n - 1), arr[n - 1]);
	    }
		private static int max(int n1, int n2)
	    {
	    return n1 > n2 ? n1 : n2;
	    }

}
