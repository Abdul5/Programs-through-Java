import java.util.*;
public class TrianglePattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1; // initialize a with 1
		for(int i = 1;i <= n;i++) { // use this loop for rows
		//	int t = i;  // initialize t with i
			for(int j = 1;j <= i;j++) { // use this loop for column
				System.out.print(a); // its print 1 to 10 in triangle
				//System.out.print(t); // its print i'th value which is inc with 1  
				a++; // inc
				//t++; // inc
			}
			System.out.println(); // its uses for changing line
		}
	}

}
