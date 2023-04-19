import java.util.*;
public class PairSumDivBy_K {
	    public static long Pairs(int []arr,int k){
	        //your code here
			long[] modCount = new long[k];
	        for (int i = 0; i < arr.length; i++) {
	            modCount[arr[i] % k]++;
	        }
	        long count = 0;
	        count += modCount[0] * (modCount[0] - 1) / 2;
	        for (int i = 1; i <= k / 2 && i != k - i; i++) {
	            count += modCount[i] * modCount[k - i];
	        }
	        if (k % 2 == 0) {
	            count += modCount[k / 2] * (modCount[k / 2] - 1) / 2;
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n,k;
	        n = sc.nextInt();
	        k = sc.nextInt();
	        int []arr=new int[n];
	        for(int i=0;i<n;++i){
	                arr[i]=sc.nextInt();
	        }
	        System.out.println(Pairs(arr,k)); 
	    }

}
