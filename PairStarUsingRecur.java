import java.util.*;
public class PairStarUsingRecur {
	static String output="";
    static void PairStar(String str,int i) {
        //Write your code here
		output = output + str.charAt(i);
        if (i == str.length() - 1)
        return;
        if (str.charAt(i) == str.charAt(i+1))
        output = output + '*';    
        PairStar(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		PairStar(s,0);
        System.out.println(output);
    }

}
