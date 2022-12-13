import java.util.*;
public class PrintHorizonVertiStars {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Solution obj=new Solution();
        obj.horizontalN(n);
        obj.verticalN(n);
        
    }
}

class Solution{
    
    static void horizontalN(int n)
    {
          // Your code here
		for(int i = 0;i < n-1;i++) {
			System.out.print("*"+" ");
		}
        
    }

    static void verticalN(int n)
    {
        // your code here
		for(int i = 0;i <= n;i++) {
			System.out.println("*");
		}
        
    }

}
