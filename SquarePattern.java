import java.util.*;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j <= n;j++) {
				System.out.print(n); //what ever you want print you put it here
				// with the place of 'n' we put 'n-j+1' then pattern print reverse means '4321'
			}
			System.out.println();
		}

	}

}
