import java.util.*;
public class RemoveOneElemTo_Convert_Palindrome {
	public static int solve(String s) {
		int i = 0,c = 0;
		int j = s.length() - 1;
		while(i <= j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				if(s.charAt(i) == s.charAt(j - 1)) 
					j--;
				else if(s.charAt(i + 1) == s.charAt(j)) 
					i++;
				else 
					return 0;
				c++;
			}
			if(c > 1) 
				return 0;
		}
		return 1;
    }
          public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
	        String A = sc.nextLine();
            int ans= solve(A);
            System.out.println(ans);
	}

}
