import java.util.*;
public class LastIndexOfOneUsingRecur {
	public static int lastIndexOfOne(String S) {
        // Write your code here
		int ans = S.lastIndexOf("1");
		return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(lastIndexOfOne(S));
    }

}
