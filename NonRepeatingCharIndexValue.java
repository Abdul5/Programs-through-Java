import java.util.*;
public class NonRepeatingCharIndexValue {
	    public static int firstUniqChar(String str) {
	        int[] charFrequency = new int[26]; // Assuming only lowercase English letters

	        // Iterate over the string and count the frequency of each character
	        for (char c : str.toCharArray()) {
	            charFrequency[c - 'a']++;
	        }

	        // Find the index of the first non-repeating character
	        for (int i = 0; i < str.length(); i++) {
	            if (charFrequency[str.charAt(i) - 'a'] == 1) {
	                return i;
	            }
	        }

	        // If no non-repeating character found, return -1
	        return -1;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        System.out.println(firstUniqChar(s));
	    }
}

/*
 Input :
ababduull

Output :
4

*/
