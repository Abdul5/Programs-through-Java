import java.util.*;
public class DiamondPatternAddOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        for(int i = 0; i < n;i++) {
        for(int j = n-i; j >= 2;j--) {
            System.out.print(" ");
        }
        for(int j = 0;j <= i;j++) {
            System.out.print("*"+" ");
         }
        System.out.println();
        }
        for(int i = 1; i < n;i++) {
        for(int j = 1; j <= i;j++) {
            System.out.print(" ");
        }
        for(int k = 0;k <= n-1-i;k++) {
            System.out.print("*"+" ");
         }
        System.out.println();
        }

	}

}
