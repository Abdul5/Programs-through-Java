import java.util.*;
public class TrianglePattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 1;
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print(start+" "); // this logic use for print 1 ln 23 ln 456 ln 78910
				start++;
			}
			System.out.println();
		}

	}

}
