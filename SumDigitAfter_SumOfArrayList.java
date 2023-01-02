import java.io.*;
import java.util.*;

	class Solution{
	    static int specialSum(ArrayList<Integer> arr, int n){
	         //Write code here
			int sum = 0;

	       for(int num : arr){

	           sum += num;

	       }

	       int res = sum - 9 *((sum - 1) / 9);

	       return res;
	        
	    }
	}

public class SumDigitAfter_SumOfArrayList {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        ArrayList<Integer> arr = new ArrayList<>();
	        for(int i=0;i<n;i++) {
	            arr.add(sc.nextInt());
	        }
	        int ans = Solution.specialSum(arr,n);
	        System.out.println(ans);
		}
	}

