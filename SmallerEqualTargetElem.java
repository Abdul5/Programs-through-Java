import java.util.*;
public class SmallerEqualTargetElem {
	public static int smallerEqual(int[] A, int B) {
	      // write code here
			int c = 0;
			for(int i = 0;i < A.length;i++) {
				if(A[i] <= B) {
					c++;
				}
			}
				return c; 
	    }

	  public static void main (String[] args){
	      Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int[] A = new int[n];
		  for(int i=0;i<n;i++){
	          A[i] = sc.nextInt();
		  }
		  int B = sc.nextInt();
	      System.out.println(smallerEqual(A,B));
		}

}
