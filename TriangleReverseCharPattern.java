import java.util.*;
public class TriangleReverseCharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			int k = n - i;
			for(int j = 1;j <= i;j++) {
				System.out.print((char)('A'+ k));
				k++;
			}
			System.out.println();
		}

	}

}

/*
output :- 
E
DE
CDE
BCDE
ABCDE
*/