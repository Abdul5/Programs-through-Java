import java.util.*;
public class TriangleCharPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			char s = (char)('A'+i-1);
			for(int j = 1;j <= i;j++) {
				System.out.print(s);
				s = (char)(s+1);
			}
			System.out.println();
		}

	}

}

/*
output :-

A
BC
CDE
DEFG

*/