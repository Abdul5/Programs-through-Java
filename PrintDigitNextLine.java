import java.util.*;
public class PrintDigitNextLine {
	    public static void main(String[] args) {

	        // Write your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String str = Integer.toString(n);
			for(int i = 0;i < str.length();i++) {
				System.out.println(str.charAt(i));
			}
	        
	    }

}
