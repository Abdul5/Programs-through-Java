import java.util.*;
public class DoubleCharCheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch [] = str.toCharArray();
		for(int i = 0; i < str.length();i++) {
			int c = 1;
			for(int j = i + 1; j < str.length();j++) {
				if(ch[i] == ch[j]) {
					c++;
				}
					
			}
	        
		if(c == 2) {
			System.out.println("Yes");
			break;
		}
		else {
			System.out.println("No");
			break;
		}
		
	  }

	}

}
