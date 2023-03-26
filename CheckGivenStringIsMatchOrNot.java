import java.util.*;
public class CheckGivenStringIsMatchOrNot {
	public static boolean Matching(String str1 , String str2) {
		int n = str1.length();
		int m = str2.length();
		if(n < m) {
			return false;
		}
		for(int i = 0;i <= n-m;i++) {
			int j;
			for(j = 0;j < m;j++) {
				if(str1.charAt(i+j) != str2.charAt(j)) {
					break;
				}
			}
			if(j == m) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(Matching(str1,str2)) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}

}
