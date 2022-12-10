import java.util.*;
public class PowerUsingRecur {
	public static int Power(int n,int x) {
		if(n == 0) return 0;
		if(x == 0) return 1;
		return n * Power(n,x - 1);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		System.out.println(Power(num,pow));
				
	}

}
