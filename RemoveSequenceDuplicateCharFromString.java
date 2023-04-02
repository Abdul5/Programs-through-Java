import java.util.*;
public class RemoveSequenceDuplicateCharFromString {
	    public static String stringClean(String s) {
	        //write code here
			if (s.length() <= 1) {
	            return s;
	        }
	        if (s.charAt(0) == s.charAt(1)) {
	            return stringClean(s.substring(1));
	        }
	        return s.charAt(0) + stringClean(s.substring(1));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        System.out.println(stringClean(s));
	        sc.close();
	    }
}
