import java.util.*;
public class All_Fibonacci_SeriesTill_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0,second = 1, fib;
		System.out.println(first);
		System.out.println(second);
		for(int i = 2;i < n;i++) {
			fib = first + second;
			System.out.println(fib);
			first = second;
			second = fib;
		}

	}

}
