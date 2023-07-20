import java.util.*;
public class NonRepeatingCharacter {
	public static Character NonRepeatChar(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		Map<Character,Integer> count = new HashMap<>();
		for(char c : ch) {
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		for(char c : ch) {
			if(count.get(c) == 1) return c;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(NonRepeatChar(str));

	}

}
/*
input :
ababcdc

Output :
d

*/