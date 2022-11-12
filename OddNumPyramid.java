import java.util.*;
public class OddNumPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 0; i < n;i++) {
                for(int j = n-1; j > i;j--) {
                        System.out.print(" ");
                }
                for(int j = 0; j < num;j++) {
                        System.out.print(num);
                }
                num += 2;
                System.out.println();
        }

	}

}
