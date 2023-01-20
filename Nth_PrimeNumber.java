import java.util.*;
public class Nth_PrimeNumber {
	static int isPrime(int n) {
		if(n <= 1) {
			return 0;
		}
		if(n == 2 || n == 3) {
			return 1;
		}
		if(n % 2 == 0 || n % 3 == 0) {
			return 0;
		}
		for(int i = 5; i * i <= n;i = i + 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return 0;
		return 1;
	}
	static int nThPrime(int n) {
		int i = 2;
		while(n > 0) {
			if(isPrime(i) == 1)
				n--;
			i++;
		}
		i -= 1;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nThPrime(n));

	}

}
