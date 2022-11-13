import java.util.*;
public class WaterBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n <= 100 ) {
	      System.out.println(n*15);
	    }
	    else if(n <= 200 ) {
	      System.out.println((100*15)+(n-100)*14);
	    }
	    else if(n > 200){
	      System.out.println((100*15)+(100*14)+(n-200)*12);
	    }

	}

}
