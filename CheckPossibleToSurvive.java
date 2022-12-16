import java.util.*;
public class CheckPossibleToSurvive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long d = sc.nextLong();
		if(n >= x && n >= d) {
			System.out.println("YES");
		}
		else if(n >= x && n <= d){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
