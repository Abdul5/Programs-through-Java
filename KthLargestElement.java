import java.util.*;
public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.toString(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i < k;i++) {
            System.out.print(arr[i]+" ");
        }

	}

}
