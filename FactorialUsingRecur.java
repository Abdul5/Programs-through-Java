import java.util.*;
public class FactorialUsingRecur {
	public static int fact(int n) {
		if(n == 0) return 1;
		int SmAns = fact(n - 1);
		return n * SmAns;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

}
