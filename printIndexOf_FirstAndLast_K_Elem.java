import java.util.*;
public class printIndexOf_FirstAndLast_K_Elem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int first = -1;
		int last = -1;
		for(int i = 0;i < n;i++) {
			if(k != arr[i]) {
				continue;
			}
			if(first == -1) {
				first = i;
			}
			last = i;
		}
		if(first != -1) {
			System.out.print(first+" "+last);
		}
		else {
			System.out.print(first+" "+last);
		}
	}

}
