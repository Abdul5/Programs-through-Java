import java.util.*;
public class DecIncPattern {
	
	static void PrintPattern(int n) {
		if(n == 0 || n < 0) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		PrintPattern(n-5);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintPattern(n);

	}

}
