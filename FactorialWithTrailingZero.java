import java.util.*;
public class FactorialWithTrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//your code here
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int fact = 1;
				for(int i = 1;i <= n;i++) {
					fact = fact * i;
				}
				int temp = fact % 10;
				if(temp == 0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}

}
