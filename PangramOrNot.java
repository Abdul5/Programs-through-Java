import java.util.*;
// only those sentence is panagram which have all alphabet other wise not panagram
public class PangramOrNot {
	public static void panagrams(String str) {
		str = str.toLowerCase();
		boolean pan[] = new boolean[26];
		int ind = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ind = str.charAt(i) - 'a';
				pan[ind] = true;
			}
		}
		for(int i = 0;i <= 25;i++) {
			if(pan[i] == false) {
				System.out.println("Not A Panagram");
				return;
			}
		}
		System.out.println("Panagram");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		panagrams(str);

	}

}
