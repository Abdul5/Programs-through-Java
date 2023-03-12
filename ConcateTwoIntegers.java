import java.util.*;
public class ConcateTwoIntegers {
	public static void conc(int a , int b) {
		String str = Integer.toString(a);
		String str1 = Integer.toString(b);
		String s = str.concat(str1);
		System.out.print(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		conc(a,b);

	}

}
