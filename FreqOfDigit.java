import java.util.*;
public class FreqOfDigit {
	static int countFreqDigit(int n,int d)
    {
        // write code here
		int c = 0;
		while(n != 0) {
			int temp = n % 10;
			n /= 10;
			if(temp == d) {
				c++;
			}
		}
		return c;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(countFreqDigit(n,d));
    }

}
