import java.util.*;
public class NumIs_SparseOrNot {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    boolean isSparse = true;
	    while (n > 0) {
	      if ((n & 1) == 1) {
	        if ((n & 2) == 2) {
	          isSparse = false;
	          break;
	        }
	        n = n >> 1;
	      }
	      else n = n >> 1;
	    }

	    System.out.println(isSparse ? "YES" : "NO");
	  }
}
