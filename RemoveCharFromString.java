import java.util.*;
public class RemoveCharFromString {
	    public static String removeChars(String S) {
	        // Write your code here
			String str = S.replaceAll("([a,c,i,o])",""); // here it remove many char from string
			
			//String str = S.replace("a", "");  //here it remove only a from string
			
			//String str = S.replaceFirst("Yo", ""); // here it remove both first char from string 
			return str;
	       
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();
	        String result = removeChars(S);
	        System.out.println(result);
	    }
}
