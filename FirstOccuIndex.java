import java.util.*;
public class FirstOccuIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0; i < n;i++) {
            if(arr[i] == k) {
                System.out.print(i);
                return;
            }
        }
        System.out.print("-1");

	}

}
