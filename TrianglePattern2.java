import java.util.*;
public class TrianglePattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
			//	for(int j = i;j >= 1;j--) { // this loop uses to print column value in reverse triangle shape
			//	System.out.print(j); // it uses to print column value
				//System.out.print(i); // it uses to print rows value
				System.out.print("*"); // it's print * in triangle shape
			}
			System.out.println();
		}
	}

}
