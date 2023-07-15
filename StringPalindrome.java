import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		int ch = str.length();
		for(int i = ch-1; i >= 0;i--) {
			str1 += str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

}




import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        int len = str.length();
        for(int i = 0;i < len;i++) {
            char ch = str.charAt(i);
            str1 = ch + str1;
        }
        if(str.equalsIgnoreCase(str1)) {
            System.out.println("is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
