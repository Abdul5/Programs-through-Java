import java.util.*;
public class ValidAnagram {
	   static boolean areAnagram(String str1, String str2) {
	       //Write your code here
		   int[] freq1 = new int[26];
	        str1 = str1.toLowerCase();
	        
	        for(int i=0;i<str1.length();i++){
	            char ch=str1.charAt(i);
	            if(ch>=97 && ch<=122){
	                int index=ch-97;
	                freq1[index]=freq1[index]+1;
	            }
	        }
	        
	          int[] freq2 = new int[26];
	        str2 = str2.toLowerCase();
	        
	        for(int i=0;i<str2.length();i++){
	            char ch=str2.charAt(i);
	            if(ch>=97 && ch<=122){
	                int index=ch-97;
	                freq2[index]=freq2[index]+1;
	            }
	        }
	        
	        for(int i=0;i<26;i++){
	            if(freq1[i]!=freq2[i]){
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();
	        
	        if (areAnagram(str1, str2))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

}
