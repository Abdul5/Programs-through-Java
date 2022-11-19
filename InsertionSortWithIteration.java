import java.util.*;
public class InsertionSortWithIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 1;i < n;i++) {
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            for(int k = 0; k < n;k++) {
            System.out.print(arr[k]+" ");
        }
            System.out.println();
        }

	}

}
