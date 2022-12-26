import java.util.*;
public class PrintAllSubSequencesUsingRecur {
	public static void SubSeq(String str, int i, String ans) {
		if(i == str.length()) {
			System.out.print(ans+" ");
			return;
		}
		SubSeq(str,i + 1,ans + str.charAt(i));
		SubSeq(str,i + 1,ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		SubSeq(str,0,"");

	}

}
