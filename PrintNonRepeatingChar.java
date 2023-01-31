import java.util.*;
public class PrintNonRepeatingChar {
	    public static void nonRepeatingCharacter(String S) {
	        // Your code here
			int[] count = new int[26];

	    // Iterate through the string and increase the count of each character

	    for (int i = 0; i < S.length(); i++) {

	        count[S.charAt(i) - 'a']++;

	    }

	    // Iterate through the string again and check if the count of each character is 1

	    for (int i = 0; i < S.length(); i++) {

	        if (count[S.charAt(i) - 'a'] == 1) {

	            System.out.print(S.charAt(i));
				return;

	        }

	    }

	    // If no non-repeating character is found, return '$'

	    System.out.print("-1");
	        
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s;
	        s=sc.next();
	        nonRepeatingCharacter(s);  
	        System.out.println();
	    }

}
