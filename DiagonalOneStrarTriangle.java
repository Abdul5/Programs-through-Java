import java.util.*;
public class DiagonalOneStrarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n;i >= 1;i--) {
			for(int j = 1;j <= n - i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}

}


/*
output :- 
3
*
 *
  *

*/