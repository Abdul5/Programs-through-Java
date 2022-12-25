import java.util.*;
public class SumOfDigitWith_X_UsingRecur {
	public static int SumDigit(String str, int x) {
		long sum = 0;
		for(int i = 0;i < str.length();i++) {
			sum += Integer.parseInt(str.charAt(i)+"");
		}
		sum = fun(sum * x);
		int p = (int)sum;
		return fun(p);
		
	}
	private static int fun(long p) {
		if(p < 10) return (int)p;
		return fun(fun(p / 10) + p % 10);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = sc.nextInt();
		System.out.print(SumDigit(str,x));
	}

}
