import java.util.*;
public class NumericPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i = 1;i <= n;i++,k = 0) {
            for(int j = 1; j <= n-i;j++) {
                System.out.print(" ");
            }
            while(k != 2*i-1) {
                System.out.print(i);
                k++;
            }
            System.out.println();
        }

	}

}
