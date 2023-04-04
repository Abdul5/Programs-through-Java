import java.util.*;
public class AddStarBetweenString {
	public static String AddStar(String S) {
		if(S.length() <= 1) {
			return S;
		}
		return S.charAt(0)+"*"+AddStar(S.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.print(AddStar(S));

	}

}
