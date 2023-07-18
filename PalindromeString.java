import java.util.*;
public class PalindromeString {
	public static String Palindrome(String str) {
		String str1 = "";
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			str1 = ch + str1;
		}
		if(str.equalsIgnoreCase(str1)) {
			return "Palindrome";
		}
		return "Not Palindrome";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(Palindrome(str));

	}

}
