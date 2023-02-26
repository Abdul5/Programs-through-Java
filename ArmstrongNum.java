import java.util.*;
public class ArmstrongNum {
//	public static int Arms(int n) {
//		int temp = 0 , sum = 0 , num = 0;
//		num = n;
//		while(num != 0) {
//			temp = num % 10;
//			sum += (int)Math.pow(temp, 3);
//			num = num / 10;
//		}
//		if(sum == n) {
//			return 1;
//		}
//		return 0;
//	}
	public static void Arms(int number) {
		int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arms(n);
		 //System.out.println(Arms(n));

	}

}
