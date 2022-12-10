import java.util.*;
public class StringEncodingsUsingRecur {
	static String str_map = " abcdefghijklmnopqrstuvwxyz";
    static void printEncodings(String str,int ind,String ans) {
        // Write your code here
		if(ind == str.length()) {
			System.out.println(ans);
			return;
		}
		if(str.charAt(ind) == '0') return;
		int i = str.charAt(ind) - '0';
		printEncodings(str,ind + 1,ans + str_map.charAt(i));
		if(ind < str.length() - 1 && (str.charAt(ind) == '1' || (str.charAt(ind) == '2' && str.charAt(ind + 1) <= '6'))) {
		i = (str.charAt(ind) - '0') * 10 + (str.charAt(ind + 1) - '0');
			printEncodings(str,ind + 2,ans + str_map.charAt(i));
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, 0, "");
    }

}
