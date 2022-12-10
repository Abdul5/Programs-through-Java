import java.util.*;
public class PhoneKeyPadCombiUsingRecur {
	static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void printKPC(String str,String ans, int index) {
        //Write your code here
		 if(index == str.length()){
            System.out.println(ans);
            return;
        }
        int digit = str.charAt(index) - '0';
        String str_at_digit = keypad[digit]; // extracting string at index;
        for(int i = 0; i < str_at_digit.length(); i++){
            printKPC(str, ans + str_at_digit.charAt(i),  index + 1);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str,"",0);
    }

}
