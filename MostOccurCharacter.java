import java.util.*;
public class MostOccurCharacter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int[] count = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	            count[s.charAt(i) - 'a']++;
	        }
	        int maxCount = 0;
	        char maxChar = 'a';
	        for (int i = 0; i < 26; i++) {
	            if (count[i] > maxCount) {
	            maxCount = count[i];
	                maxChar = (char)(i + 'a');
	            }
	        }
	        System.out.println(maxChar);
	    }
}
