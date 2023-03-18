import java.util.*;
public class SquareCharPattern2 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 1;i <= n;i++) {
				char start = (char)('A' + i - 1);
				for(int j = 1;j <= n;j++) {
					System.out.print(start);
					start = (char) (start + 1);
					
				}
				System.out.println();
			}
		}

}


/*
output :-

ABCD
BCDE
CDEF
DEFG

*/