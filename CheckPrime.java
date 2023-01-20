import java.util.*;
public class CheckPrime {
		static boolean isPrime(int n)
		{
			// Corner case
			if (n <= 1)
				return false;

			// Check from 2 to n-1
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;

			return true;
		}

		// Driver Program
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (isPrime(n))
				System.out.println(n +" is a prime number");
			else
				System.out.println(n +" is not a prime number");
		}
}
