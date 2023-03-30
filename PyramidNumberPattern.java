import java.util.*;
public class PyramidNumberPattern {
		public static void main(String args[]) {
			// your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 1;i <= n;i++) {
				int s = i;
				for(int j = 1;j <= n - i;j++) {
					System.out.print(" ");
				}
				for(int j = 1;j <= i;j++) {
					System.out.print(s);
					s++;
				}
				s = s - 2;
				for(int j = 1;j < i;j++) {
					System.out.print(s);
					s--;
				}
				System.out.println();
			}
		}
}

/*
 input :- 5
 output :-
    1
   232
  34543
 4567654
567898765

*/

