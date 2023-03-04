import java.util.*;
public class CountPairs_In_String {
	public static int StrCount(String str) {
		if(str.length() < 3) return 0;
		else if(str.charAt(0) == str.charAt(2)) {
			return 1 + StrCount(str.substring(1));
		}
		else {
			return StrCount(str.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(StrCount(str));

	}

}
