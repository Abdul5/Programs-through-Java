import java.util.*;
public class PrintStairPathUsingRecur {
	public static void StairPath(int n, String psf) {
		if(n < 0) return;
		if(n == 0) {
			System.out.println(psf);
			return;
		}
		StairPath(n - 1, psf + "1");
		StairPath(n - 2, psf + "2");
		StairPath(n - 3, psf + "3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StairPath(n,"");

	}

}
