import java.util.*;
public class FindCharacterFromString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the input values
	        int N = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        String S = scanner.nextLine();
	        char C = scanner.nextLine().charAt(0);

	        // Find the position of the character in the string
	        int position = findCharacterPosition(S, C);

	        // Print the result
	        System.out.println(position);

	        scanner.close();
	    }

	    public static int findCharacterPosition(String str, char c) {
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == c) {
	                return i + 1; // Add 1 to convert 0-based index to 1-based index
	            }
	        }
	        return -1; // Character not found
	    }
}

/*
 input :
5
abdul
d

Output :
3
*/
