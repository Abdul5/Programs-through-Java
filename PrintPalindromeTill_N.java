import java.util.*;
public class PrintPalindromeTill_N {
	public static void countPal(int min, int max)
    {
        // write code here
		int rev = 0,n,b;
		for (int i = min; i <= max; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
    }


    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();   
        countPal(start, end);
    }

}
