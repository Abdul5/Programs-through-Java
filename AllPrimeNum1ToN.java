import java.util.*;
public class AllPrimeNum1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count=0;
	     for(long i = 2;i <= n;i++) {
             count = 0;
             for(long j = 1; j <= i ;j++) {
                 if(i % j == 0) {
                     count++;
                 }
             }
             if(count == 2) {
                 System.out.print(i+" ");
             }
         }

	}

}
