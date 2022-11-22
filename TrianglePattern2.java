import java.util.*;
public class TrianglePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n;i++) {
			int start = i;
			for(int j = 1; j <= i;j++) {
				System.out.print(start); //this logic is use for 1 ln 23 ln 345 ln 4567
				start++;
			}
			System.out.println();
		}

	}

}
