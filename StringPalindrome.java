import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		int ch = str.length();
		for(int i = ch-1; i >= 0;i--) {
			str1 += str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

}
