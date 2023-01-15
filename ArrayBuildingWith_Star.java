import java.util.*;
public class ArrayBuildingWith_Star {

	  public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];

	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	      max = Math.max(max, arr[i]);
	    }
	    sc.close();
	    barGraph(arr, n);
	  }

	  public static void barGraph(int[] arr, int n) {
	    // your code here
		  int max = arr[0];
		  for(int i = 1;i < n;i++) {
			  if(arr[i] > max) {
				  max = arr[i];
			  }
		  }
		  for(int fl = max;fl >= 1;fl--) {
			  for(int i = 0;i < n;i++) {
				  if(arr[i] >= fl) {
					  System.out.print("*\t");
				  }
				  else {
					  System.out.print("\t");
				  }
			  }
			  System.out.println();
		  }
	    }

}
