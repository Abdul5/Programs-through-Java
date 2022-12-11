import java.util.*;
public class NumOfDigitsUsingRecur {
	static int c = 0;
	static int CountDigits(int n) {
		if(n == 0) return 0;
		c++;
		CountDigits(n / 10);
		return c;
		// return  1 + CountDigits(n/10); // this code is also working for count dig
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(CountDigits(n));
	}

}
