import java.util.*;
public class RemoveDuplicateCharFromString {
	public static String RemoveDupChar(String str) {
		String res = "";
		for(int i = 0;i < str.length();i++) {
			while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
				i++;
			}
			res += str.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(RemoveDupChar(str));

	}

}

/*
input :
aaabbbb

output :
ab

*/