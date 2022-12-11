import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		while(n != 0) {
			n = n / 10;
			c++;
		}
		System.out.print(c);
//		for(;n != 0;n = n/10,c++) {}   // this is also working for count digits
//		System.out.print(c);
	}

}
