import java.util.*;
public class UltraFastMathematician {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.nextLine();
	        String b = sc.nextLine();

	        StringBuilder c = new StringBuilder();

	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) != b.charAt(i)) {
	                c.append("1");
	            } else {
	                c.append("0");
	            }
	        }

	        System.out.println(c.toString());
	    }
}
