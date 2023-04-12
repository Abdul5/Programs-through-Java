import java.util.*;
public class RemoveConsecutiveDuplicateFromString {
	public static String RemoveDuplicate(String s) {
		StringBuilder res = new StringBuilder();
		char prevChar = '\0';
		for(int i = 0;i < s.length();i++) {
			char currChar = s.charAt(i);
			if(currChar != prevChar) {
				res.append(currChar);
				prevChar = currChar;
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(RemoveDuplicate(s));

	}

}

/*
 input :-
aabbdduull

output :-
abdul

*/