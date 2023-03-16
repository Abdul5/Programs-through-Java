import java.util.*;
public class RemoveCharFromStr2Which_IsPresentInStr1 {
	    public static String removeChars(String s1, String s2) {
			// write code here
			for(int i = 0;i < s2.length();i++) {
				char ch = s2.charAt(i);
				while(s1.contains(ch+"")) {
					s1 = s1.replace((ch+""),"");
				}
			}
			return s1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.next(), s2 = sc.next();
			sc.close();
			System.out.println(removeChars(s1, s2));
		}
}
