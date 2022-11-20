import java.util.*;
public class FactorialUsingLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long fact = 1;
        for(int i = 1; i <= n;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
	}

}
