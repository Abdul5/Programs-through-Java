import java.util.*;
public class BunnyEars {
	public static int bn(int bunny) {
		if(bunny == 0) return 0;
		if(bunny % 2 == 0) return 3 + bn(bunny - 1);
		return 2 + bn(bunny - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(bn(n));

	}

}
