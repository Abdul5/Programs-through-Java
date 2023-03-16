import java.util.*;
public class ExcelColumnNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        int result = 0; // use this variable for count
	        for (int i = 0; i < input.length(); i++) { // taking loop for traversing
	            int value = input.charAt(i) - 'A' + 1; // Count and assign the value 
	            result = result * 26 + value; // final count is assign in result
	        }
	        System.out.println(result); // print the final output
	    }
}
