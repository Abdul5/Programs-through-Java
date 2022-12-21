import java.util.*;
public class MedianOfArray {
	static double median(int[] A, int[] B)
    {
        //Your code here
		double d = 0;
		int c1 = A.length + B.length;
		int c[] = new int[c1];
		System.arraycopy(A, 0, c, 0, A.length);
		System.arraycopy(B, 0, c, A.length, B.length);
		Arrays.sort(c);
		if(c1 % 2 != 0) {
			d = c[c1 / 2];
		}
		else {
			d = (c[c1 / 2 - 1] + c[c1 / 2]) / 2.0;
		}
		return d;
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int m = sc.nextInt();
    int n = sc.nextInt();
    int[] A = new int[m];
	  for(int i=0;i<m;i++){
      A[i] = sc.nextInt();
		}
	  int[] B = new int[n];
	  for(int i=0;i<n;i++){
      B[i] = sc.nextInt();
		}
    System.out.format("%.2f", median(A,B));

	}

}
