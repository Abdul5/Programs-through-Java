import java.util.*;
public class CrazyNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        
	        int count = 1, num = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num % 10);
	                num++;
	                if (num == 10) {
	                    num = 1;
	                }
	                count++;
	            }
	            System.out.println();
	        }
	    }
}
