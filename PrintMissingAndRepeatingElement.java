import java.util.*;

	class Sol 
	{
	    static int[] findRepeatingAndMissingNumbers(int[] arr, int n) 
	    {
	        //Write code here and print output
			int a[]=new int[2];
	    for(int i=0;i<n;i++)
	    {
	        int x=Math.abs(arr[i])-1;
	        if(arr[x]<0) a[0]=x+1;
	        else arr[x]*=-1;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>0) a[1]=i+1;
	    }
	       return  a;
	    }
	}

	public class PrintMissingAndRepeatingElement {
	    public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] nums = new int[N];
	        for(int i=0;i<N;i++) {
	            nums[i] = sc.nextInt();
	        }
	        int[] ans = Sol.findRepeatingAndMissingNumbers(nums,N);
	        System.out.print(ans[0] + " " + ans[1] + "\n");
	    }

}
