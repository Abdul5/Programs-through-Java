import java.util.*;
public class All_Fibonacci_SeriesTill_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0,second = 1;
		for(int i = 1;i <= n;i++) {
			System.out.println(first);
			int fib = first + second;
			first = second;
			second = fib;
		}

	}

}
