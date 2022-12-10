import java.util.*;
public class SumOfNaturalNumUsingRecur {
	static int sumOfNat(int n) {
		if(n == 1) return 1;
		return sumOfNat(n - 1) + n;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sumOfNat(num));
	}

}
