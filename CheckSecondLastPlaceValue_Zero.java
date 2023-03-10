import java.util.*;
public class CheckSecondLastPlaceValue_Zero {
	public static boolean secLZero(int n) {
		String str = Integer.toString(n);
		int len = str.length();
		if(len < 2) return false;  // check if there are at least two digits
		return str.charAt(len - 2) == '0'; // check if the second last digit is zero
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(secLZero(n)) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}

}
