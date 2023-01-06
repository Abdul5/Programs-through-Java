import java.util.*;
public class DigitRightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int k = scn.nextInt();
	    int nod = 0; //number of digits
	    int temp = n;
	    while(temp > 0) {
			temp /= 10;
			nod++;
		}
		  k = k % nod;
		  if(k < 0) {
			  k += nod;
		  }
		  int div = 1;
		  int mul = 1;
		  for(int i = 1;i <= nod;i++) {
			  if(i <= k) {
				  div *= 10;
			  }
			  else {
				  mul *= 10;
			  }
		  }
		  int q = n / div;
		  int r = n % div;
		  int rot = r * mul + q;
		  System.out.println(rot);

	}

}
