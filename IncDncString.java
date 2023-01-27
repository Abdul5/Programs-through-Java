import java.util.*;
public class IncDncString {
	public static String IncDnc(String str[]) {
		boolean inc = true;
		boolean dnc = true;
		for(int i = 1;i < str.length;i++) {
			if(str[i - 1].compareTo(str[i]) > 0) {
				inc = false;
			}
			if(str[i - 1].compareTo(str[i]) < 0) {
				dnc = false;
			}
		}
		if(inc) {
			return "INCREASE";
		}
		else if(dnc) {
			return "DECREASE";
		}
		return "NEITHER";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0;i < n;i++) {
			str[i] = sc.next();
		}
		System.out.println(IncDnc(str));

	}

}
