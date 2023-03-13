import java.util.*;
public class Abdul_Savings {
	public static int save(int inc, int exc) {
		double res = inc - (inc * (double) exc / 100);
		return (int) res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		System.out.print(save(n,n1));

	}

}
