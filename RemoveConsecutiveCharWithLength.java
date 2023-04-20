import java.util.*;
import java.lang.*;
import java.io.*;
public class RemoveConsecutiveCharWithLength {
	
	    public static String removeDuplicates(String s, int k) {
	        // write code here
			Stack<Character> stack = new Stack<>();
	        Stack<Integer> countStack = new Stack<>();
	        for (char c : s.toCharArray()) {
	            if (stack.isEmpty() || stack.peek() != c) {
	                stack.push(c);
	                countStack.push(1);
	            } else {
	                int count = countStack.pop() + 1;
	                if (count == k) {
	                    stack.pop();
	                } else {
	                    countStack.push(count);
	                }
	            }
	        }

	        StringBuilder sb = new StringBuilder();
	        while (!stack.isEmpty()) {
	            char c = stack.pop();
	            int count = countStack.pop();
	            for (int i = 0; i < count; i++) {
	                sb.append(c);
	            }
	        }
	        return sb.reverse().toString();
	    }
	  public static void main (String[] args)
		{
	      Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  int k = sc.nextInt();
	      System.out.println(removeDuplicates(s,k));
		}

}

/*
 input :-
aabbddul
2

output :-
ul

*/
