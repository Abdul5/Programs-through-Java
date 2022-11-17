import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int sm = Integer.MAX_VALUE;
        int SeSm = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++) {
            if(arr[i] < sm) {
                SeSm = sm;
                sm = arr[i];
            }
            else if(arr[i] < SeSm && arr[i] != sm) {
                SeSm = arr[i];
            }
        }
        System.out.println(SeSm);

	}

}
