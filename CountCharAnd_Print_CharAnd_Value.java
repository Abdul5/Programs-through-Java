import java.util.*;
public class CountCharAnd_Print_CharAnd_Value {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int digit = 0;
		for(int i = 0;i < str.length();i++) {
			int c = 0;
			for(int j = 0;j < str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					c++;
				}
			}
			digit = 0;
			for(int j = i - 1;j >= 0;j--) {
				if(str.charAt(i) == str.charAt(j)) {
					digit = 2;
				}
			}
			if(digit != 2) {
				System.out.print(str.charAt(i)+""+c);
			}
		}
	}
}
