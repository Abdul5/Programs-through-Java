import java.util.*;
public class TriangleCharPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print((char)('A'+i-1));
			}
			System.out.println();
		}
	}

}

/*
output :- 

A
BB
CCC

*/