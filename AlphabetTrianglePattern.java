import java.util.*;
public class AlphabetTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 65;
        for(int i = 0;i < n;i++) {
            for(int j = 0; j <= i;j++) {
                System.out.print((char)alpha);
            }
            alpha++;
            System.out.println();
        }

	}

}
