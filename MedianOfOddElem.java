import java.util.*;
public class MedianOfOddElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int med = 0;
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n;i++) {
            if(n % 2 == 1) {
                med=arr[(n+1)/2-1];
            }

        }
        System.out.println(med);

	}

}
