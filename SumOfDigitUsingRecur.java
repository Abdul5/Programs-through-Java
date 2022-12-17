import java.util.*;
public class SumOfDigitUsingRecur {
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int ans = sumDigit(n);
        System.out.println(ans);      
		sc.close();
    }

	static int sumDigit(int n ) {
        //Write your code here
		if(n == 0) return 0;
		return (n % 10 + sumDigit(n / 10));
		
    }

}
