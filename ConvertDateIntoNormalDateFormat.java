import java.util.*;
public class ConvertDateIntoNormalDateFormat {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character after reading n

	        for (int i = 0; i < n; i++) {
	            String date = scanner.nextLine();
	            String convertedDate = convertDateFormat(date);
	            System.out.println(convertedDate);
	        }
	    }

	    private static String convertDateFormat(String date) {
	        String[] parts;
	        if (date.contains(".")) {
	            parts = date.split("\\.");
	            return parts[0] + "." + parts[1] + "." + parts[2] + " " + parts[1] + "/" + parts[0] + "/" + parts[2];
	        } else {
	            parts = date.split("/");
	            return parts[1] + "." + parts[0] + "." + parts[2] + " " + parts[0] + "/" + parts[1] + "/" + parts[2];
	        }
	    }
}

/*
 Input :
 2
12.11.2000
Output :- 12.11.2000 11/12/2000

Input:-
10.09.2002

Output :- 10.09.2002 09/10/2002

*/
