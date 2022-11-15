import java.util.*;
public class SwitchCaseWithMultiVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(a % b) {
            case 0 : System.out.println("Remainder is too small");
                           break;
            case 1 : System.out.println("Remainder is small");
                           break;
            case 2 : System.out.println("Remainder is large");
                           break;
            default : System.out.println("Remainder is too large");
                           break;
        }

	}

}
