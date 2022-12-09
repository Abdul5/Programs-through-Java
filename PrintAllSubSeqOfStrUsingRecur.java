import java.util.*;
public class PrintAllSubSeqOfStrUsingRecur {
	static void printSubsequence(String s, int index, String curr) {
        //Write your code here
		int n = s.length();
        if (index == n) {
            System.out.print(curr+" ");
            return;
        }
        printSubsequence(s, index + 1, curr + s.charAt(index));
        printSubsequence(s, index + 1, curr);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		int index = 0;
        String curr = "";
        printSubsequence(s, index, curr);
    }

}
