import java.util.*;
public class ArrayIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            for(int i = 0;i < n-1;i++) {
                if(arr[i] < arr[i+1]) {
                    c++;
                }
            }
            if(c == n-1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            k--;
      }

	}

}
