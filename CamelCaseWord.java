import java.util.*;
public class CamelCaseWord {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String s = scanner.nextLine();
	        
	        // Call the function to extract and print the words
	        printCamelCaseWords(s);
	    }
	    
	    public static void printCamelCaseWords(String s) {
	        StringBuilder currentWord = new StringBuilder();
	        
	        // Iterate through each character in the string
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            // Check if the character is uppercase
	            if (Character.isUpperCase(c)) {
	                // If we have a current word, print it
	                if (currentWord.length() > 0) {
	                    System.out.println(currentWord);
	                }
	                
	                // Start a new word with the uppercase character
	                currentWord = new StringBuilder();
	                currentWord.append(c);
	            } else {
	                // Append lowercase or non-alphabetic characters to the current word
	                currentWord.append(c);
	            }
	        }
	        
	        // Print the last word
	        if (currentWord.length() > 0) {
	            System.out.println(currentWord);
	        }
	    }
}

/*
 input :-
IAmAbdulQuadir

Output :-
I
Am
Abdul
Quadir

*/
