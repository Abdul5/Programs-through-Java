import java.util.*;
public class DiamondHolePattern {
	    public static void main (String[] args) throws java.lang.Exception
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            int range =(i>n/2?n-i-2:i-1);
	            for(int j=0;j<n;j++)
	            {
	                if(  j>=n/2-range  &&  j<=n/2+range  )
	                    System.out.print(" ");
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}

/*
input :-
3
output :-
***
* *
***

*/