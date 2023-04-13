import java.util.*;
public class RemoveTargetSubString {
	public static String removeTarget(String str , String target) {
		while(str.contains(target)) {
			int idx = str.indexOf(target);
			str = str.substring(0, idx) + str.substring(idx + target.length());
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String target = sc.nextLine();
		String res = removeTarget(str,target);
		System.out.print(res);

	}

}

/* 
input :- 
axxxxyyyyb
xy

output :-
ab

*/