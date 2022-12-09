import java.util.*;
public class CountABC_ABA_usingRecur {
	static int CountABC(String str) {
        // Write your code here
  if (str.length() < 3) return 0;
  if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
    return 1 + CountABC(str.substring(1));
  else
    return CountABC(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s));

    }

}
