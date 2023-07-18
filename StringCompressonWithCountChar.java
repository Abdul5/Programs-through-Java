import java.util.*;
public class StringCompressonWithCountChar {
	public static String Compresson(String str) {
		String res = "";
		for(int i = 0;i < str.length();i++) {
			int count = 1;
			while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			res += str.charAt(i);
			if(count > 1) {
				res += count;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Compresson(str));

	}

}
