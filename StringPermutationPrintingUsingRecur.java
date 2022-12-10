import java.util.*;
public class StringPermutationPrintingUsingRecur {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      String s=scn.nextLine();
	      String asf="";
	      permutationPrint(s,asf);
	   }
	   public static void permutationPrint(String s, String asf)
	    {
	        // your code here
			if (s.length() == 0) {
	            System.out.println(asf);
	            return;
	        }
	 
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            String left_substr = s.substring(0, i);
	            String right_substr = s.substring(i + 1);
	            String rest = left_substr + right_substr;
	            permutationPrint(rest, asf + ch);
	        }
	    }

}
