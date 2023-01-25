import java.util.*;
public class MergeTwoStringOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int len = Math.max(str1.length(), str2.length());
		for(int i = 0;i < len;i++) {
			if(i < str1.length()) {
				sb.append(str1.charAt(i));
			}
			if(i < str2.length()) {
				sb.append(str2.charAt(i));
			}
		}
		System.out.print(sb.toString());

	}

}
