import java.util.*;
public class TriangleRevNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n;i++) { //this loop is use for row
			int s = i;
			for(int j = 1; j <= i;j++) { //this loop is use for column 
				System.out.print(s);
				s--;
			}
			System.out.println();
		}

	}

}
