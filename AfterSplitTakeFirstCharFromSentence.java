import java.util.*;
public class AfterSplitTakeFirstCharFromSentence {
	       static String autori(String str){
	        // Your code here
	        String arr[] = str.split("-");
	        String ans = "";
	        for(int i = 0;i < arr.length;i++) {
	            ans = ans + arr[i].charAt(0);
	        }
	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str=sc.next();
	        String result = autori(str);
	        System.out.print(result);        
	        System.out.println('\n');
	    }
}
