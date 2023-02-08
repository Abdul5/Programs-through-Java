import java.util.*;
public class PlusMinusUsingArray {
		public static void main (String[] args) throws java.lang.Exception
		{
			//your code here
	    Scanner sc = new Scanner(System.in);
	    float p = 0,ne = 0,z = 0;
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    for(int i = 0; i < n; i++) {
	      if(arr[i] > 0) {
	        p++;
	      }
	      else if(arr[i] < 0) {
	        ne++;
	      }
	      else {
	        z++;
	      }
	    }
	    float res = n;
	    float a = (float)p/res;
	    float b = (float)ne/res;
	    float c = (float)z/res;
	    System.out.printf("%.6f" ,a);
		System.out.println();
	    System.out.printf("%.6f",b);
		System.out.println();
	    System.out.printf("%.6f",c);
		}
}
