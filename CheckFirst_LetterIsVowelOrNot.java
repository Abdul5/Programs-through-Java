import java.util.*;
public class CheckFirst_LetterIsVowelOrNot {
	    public static void main(String[] args) throws Throwable {
	        // Write your code here
			Scanner sc = new Scanner(System.in);
	        String name = sc.next();

	        char firstChar = name.charAt(0);
	        boolean isVowel = (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U');

	        if (isVowel) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }
	    }
}
