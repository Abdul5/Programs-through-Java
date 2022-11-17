import java.util.*;
public class KthSmallestAndLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
         Arrays.sort(arr);
        System.out.println(arr[k-1]);
        for(int i = 0; i < n-1;i++) {
            for(int j = i+1;j < n;j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[k-1]);

	}

}
