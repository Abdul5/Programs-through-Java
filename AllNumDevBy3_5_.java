import java.util.*;
public class AllNumDevBy3_5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\nDivided by 3: ");
		for(int i = 1; i < n;i++) {
			if(i % 3 == 0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("\n\nDivided by 5: ");
		for(int i = 1; i < n;i++) {
			if(i % 5 == 0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("\n\nDivided by 3 & 5: ");
		for(int i = 1; i < n;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println("\n");

	}

}
