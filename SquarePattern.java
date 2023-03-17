import java.util.*;
public class SquarePattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {  // this line use to print rows
			for(int j = 1;j <= n;j++) { // this line use to print column
				
			//	for(int j = n;j >= 1;j--) { // it uses to print reverse column value
				
				//System.out.print("*"); // this line use print * 
				
				System.out.print(n);  // this line use to print n number
				
				//System.out.print(i);  // this line use to print rows value
				
				//System.out.print(j);  // this line use to print column value
			}
			System.out.println(); // this statement uses for change the line
		}
	}

}
