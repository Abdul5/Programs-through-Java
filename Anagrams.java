import java.util.*;
public class Anagrams {
	public static String Anagram(String str1 , String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean IsAnagram = Arrays.equals(ch1, ch2);
			if(IsAnagram) return "Yes";
			else return "No";
			
		}
		return "No";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(Anagram(str1,str2));

	}

}

/*
 input :
 race
care

Output :
Yes

input :
race
caar

Output :
No
*/
