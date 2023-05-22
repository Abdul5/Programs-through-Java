import java.util.*;
public class MinimumLengthString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt(); // Number of strings
	        scanner.nextLine(); // Consume the newline
	        
	        String minString = "";
	        
	        // Initialize minString with the first string
	        if (n > 0) {
	            minString = scanner.nextLine();
	        }
	        
	        // Read the remaining strings and update minString if a shorter string is found
	        for (int i = 1; i < n; i++) {
	            String currentString = scanner.nextLine();
	            
	            if (currentString.length() < minString.length()) {
	                minString = currentString;
	            }
	        }
	        
	        // Print the minimum length string
	        System.out.println(minString);
	    }
}

/*
 input :-
 3
abdul
quadir
bro

Output :-
bro

*/
