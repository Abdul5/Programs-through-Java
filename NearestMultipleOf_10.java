import java.util.*;
public class NearestMultipleOf_10 {
	   static int roundToNearest(int n)
	    {
	        //Write code here
			int a = (n / 10) * 10;
	          
	        // Larger multiple
	        int b = a + 10;
	      
	        // Return of closest of two
	        return (n - a > b - n)? b : a;
	    }
	    
	    public static void main (String[] args){
			
	        Scanner sc = new Scanner(System.in);
	        
	        int n;
	        
	        n = sc.nextInt();
			    
	        int res = roundToNearest(n);
	        
	        System.out.println(res);
			    	    
		}

}
