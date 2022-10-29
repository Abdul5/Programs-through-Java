import java.util.*;
public class StringRemoveConsecutiveDuplicates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = new String();
		int len = str.length();
		int temp = Integer.MIN_VALUE;
		for(int i = 0;i < len;i++) {
			if(temp != str.charAt(i)) {
				str1 += str.charAt(i);
			}
			temp = str.charAt(i);
		}
		System.out.println(str1);
		
	}

}
