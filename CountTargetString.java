import java.util.*;
public class CountTargetString {
	    public static int countHi(String s, int idx){
	        // Write code here
			if(s.length()==0)
	        return idx;
	        else {
	        if(s.endsWith("hi"))
	            idx++;

	    return countHi(s.substring(0, s.length()-1) , idx);
	    }
	}
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        String s = input.next();
	        System.out.println(countHi(s, 0));
	    }
}
