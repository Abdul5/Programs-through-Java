import java.util.*;
public class SwapArray {
	    static String arraySwaps(int arr[],int n,int x)
	    {
	        // Your code here
			boolean isSorted = true;
	        boolean isSwappable = false;
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                isSorted = false;
	            }
	            if (i + x < n && arr[i] > arr[i + x]) {
	                isSwappable = true;
	                break;
	            }
	        }
	        if (isSorted || isSwappable) {
	            return "YES";
	        } 
			return "NO";
	        
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	        }

	        String ans = arraySwaps(a,n,x);
	        System.out.println(ans);
	    }

}
