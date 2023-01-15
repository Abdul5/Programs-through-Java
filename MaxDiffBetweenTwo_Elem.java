import java.util.*;
public class MaxDiffBetweenTwo_Elem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        n = sc.nextInt();
	        int []arr=new int[n];
	        for(int i=0;i<n;++i){
	                arr[i]=sc.nextInt();
	        }
	        ArrayProblem(arr);  
	    }

	    
	    public static void ArrayProblem(int []arr) {
			int n = arr.length;
	        int minEle = arr[0];
	        int maxEle = arr[0];
	        for (int i = 1; i < n; i++) {
	            minEle = Math.min(minEle, arr[i]);
	            maxEle = Math.max(maxEle, arr[i]);
	        }
	 
	        System.out.println(maxEle - minEle);
	    }

}
