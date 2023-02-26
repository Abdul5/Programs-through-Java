import java.util.*;
public class FibonacciSeries {
	public static void fib(int n) {
		int a = 0;   // first number
		int b = 1 , sum = 0; // second num and also assign next num in sum
		System.out.print(a+" "+b+" ");  // print first and second num
		for(int i = 2;i <= n;i++) {   // this loop print all num till n after first and second num
			sum = a + b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
		}
	//	System.out.print(sum+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fib(n);  // call fib function
	}

}
