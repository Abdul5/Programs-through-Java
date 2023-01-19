import java.util.*;
public class CheckLowerUpperReturnChar {
	    public static char LowerUpper(char ch) {
	        //Write your code here
			if('a' <= ch && ch <= 'z') {
				return 'L';
			}
			if('A' <= ch && ch <= 'Z') {
				return 'U';
			}
			return 0;

	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char ch = sc.next().charAt(0);

	        System.out.println(LowerUpper(ch));
	    }

}
