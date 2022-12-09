import java.util.*;
public class RemoveXfromStrUsingRecur {
	static String noX(String s) {
        // Write your code here
	if(s.length()<=1)
   {
	if(s.charAt(0)=='x')
	{
		return "";
	}
	else
		return s;
	}
    if(s.charAt(0)=='x')
    {
    s=s.substring(1);
    return noX(s);
    }
    return s.charAt(0)+noX(s.substring(1));
        
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}
