import java.util.*;
public class LargestBetweenThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c)
	        System.out.println("Biggest number is a ="+ a);
	    if (b > a && b > c)
	    	System.out.println("Biggest number is b ="+ b);
	    if (c > a && c > b)
	    	System.out.println("Biggest number is c ="+ c);

	}

}
