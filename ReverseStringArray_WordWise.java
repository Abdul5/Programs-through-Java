import java.util.*;
public class ReverseStringArray_WordWise {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String str[] = sc.nextLine().split(" ");
	        String str1 = "";
	        for(int i = str.length-1;i >= 0;i--) {
	            str1 += str[i]+" ";
	        }
	        System.out.print(str1.substring(0,str1.length()-1));
	        
	    }
}
