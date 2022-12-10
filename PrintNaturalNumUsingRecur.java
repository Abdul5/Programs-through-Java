import java.util.*;
public class PrintNaturalNumUsingRecur {
	public static void Natu_Num(int n) {
		if(n == 0) return;
		Natu_Num(n - 1);
		System.out.print(n+" ");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Natu_Num(num);
	}

}
