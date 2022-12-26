import java.util.*;
public class StringEncodingUsingRecur {
	public static String s = " abcdefghijklmnopqrstuvwxyz";
	public static void StrEncod(String str, int ind, String ans) {
		if(ind == str.length()) {
			System.out.println(ans);
			return;
		}
		if(str.charAt(ind) == '0') return;
		int i = str.charAt(ind) - '0';
		StrEncod(str,ind + 1,ans + s.charAt(i));
		if(ind < str.length() - 1) {
			i = (str.charAt(ind) - '0') * 10 + (str.charAt(ind + 1) - '0');
			if(i <= 26) 
				StrEncod(str,ind + 2,ans + s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StrEncod(str,0,"");

	}

}
