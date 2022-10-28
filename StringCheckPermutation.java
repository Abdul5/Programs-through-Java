import java.util.*;
public class StringCheckPermutation {
	public static Boolean isPermutation(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        s1 = new String(s1Arr);
        s2 = new String(s2Arr);
        return s1.equals(s2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println(isPermutation(str,str1));
	}

}
