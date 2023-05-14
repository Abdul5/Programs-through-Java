import java.util.*;
public class InvertedPyramidStarPattern {
	public static void InvertPyramid(int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j < n - i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		InvertPyramid(n);

	}

}

/*
input :-
4
Output :-
* * * * 
 * * * 
  * * 
   *

*/