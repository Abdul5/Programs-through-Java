import java.io.*;
import java.util.*;
	public class ASCII_String_ValueWithChar {
	  
	  public static String solution(String str) {
		  StringBuilder sb = new StringBuilder();
		  sb.append(str.charAt(0));
		  for(int i = 1;i < str.length();i++) {
			  char cur = str.charAt(i);
			  char prev = str.charAt(i - 1);
			  int gap = cur - prev;
			  sb.append(gap);
			  sb.append(cur);
		  }
		  return sb.toString();
	 
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	    System.out.println(solution(str));
	  }

}
