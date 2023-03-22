import java.util.*;
public class MirrorTriangleNumPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= n - i;j++) {
				System.out.print(" ");
			}
			int num = i;
			for(int j = 1;j <= i;j++) {
				System.out.print(num);
				num++;
			}
			num = num - 2;
			for(int j = num;j >= i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

/*
output :- 
    1
   232
  34543
 4567654
567898765

*/
