import java.util.*;
public class CountUpperLowerReturnLowerOper {
	    static int minOperation(String s){
	        //Write your code here
			int upper = 0;
			int lower = 0;
			for(int i = 0;i < s.length();i++) {
				char c = s.charAt(i);
				if(Character.isUpperCase(c)) {
					upper++;
				}
				else {
					lower++;
				}
			}
			if(upper == 0 || lower == 0) return 0;
			else if(upper > lower) return lower;
			return upper;
	    }
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);
	        String s = input.next();
	        System.out.println(minOperation(s));
	    }

}
