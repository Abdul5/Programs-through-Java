import java.util.*;
public class NumberofValidTriangles {

	    public static int ValidTriangles(int[] nums){
	        //write code here
			Arrays.sort(nums);
	        int res = 0, n = nums.length, i, j, k;
	        for(i = 0; i<n ; i++) {
	            for(j = i+1, k = j+1; j<(n - 1) && k<=n;) {
	                if(k == n || nums[i]+nums[j] <= nums[k]){
	                    if(k > (j+1))
	                        res += k - j - 1;
	                    j++;
	                }else k++;
	            }
	        }
	        return res;
	    }

	    public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int []arr = new int[n];
	        for(int i=0;i<n;++i){
	            arr[i]=sc.nextInt();
	        }
	        int ans = ValidTriangles(arr);
	        System.out.println(ans);
	    }
}
