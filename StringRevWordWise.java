import java.util.*;
public class StringRevWordWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int end = str.length();
		int i = str.length()-1;
		String res = "";
		while(i >= 0) {
			if(str.charAt(i)==' ') {
				res = res + str.substring(i+1, end)+" ";
				end = i;
			}
			i--;
		}
		res += str.substring(i+1, end);
		System.out.println(res);
		

	}

}
