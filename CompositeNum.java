import java.util.*;
public class CompositeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int count = 0; 
	      for(int i = 1; i <= n; i++) {
	         if (n % i == 0)
	            count++;
	      }
	      if (count > 2)
	         System.out.println("Yes");
	      else
	         System.out.println("No");

	}

}
