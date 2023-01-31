import java.util.*;
public class ReverseIntegerAlsoWithNegativeInt {
	public static int Reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int temp = num % 10;
			if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
				return 0;
			}
			rev = (rev * 10) + temp;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(Reverse(n));

	}

}
