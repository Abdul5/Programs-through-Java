import java.util.*;
public class SeriesPattern_1by2add1by3andSoOn {
	static double pattern(int n) {
		double i , sum = 0.0;
		for(i = 1;i <= n;i++) {
			sum = sum + 1/i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(pattern(n));

	}

}
