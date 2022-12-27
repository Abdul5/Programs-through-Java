import java.util.*;
public class TrianglePatternUsingRecur {
	public static void fun(int num) {
		if(num == 0) return;
		System.out.print("*"+" ");
		fun(num - 1);
	}
	public static void StarTri(int num ,int i) {
		if(num == 0) return;
		fun(i);
		System.out.println();
		StarTri(num - 1, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StarTri(num,1);

	}

}
