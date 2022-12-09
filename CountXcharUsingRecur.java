import java.util.*;
public class CountXcharUsingRecur {
	static int countX(String str) {
        //Write your code here
	if(str == null || str.isEmpty())
    return 0;
    return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        System.out.println(countX(str));
    }

}
