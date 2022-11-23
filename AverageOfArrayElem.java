import java.util.*;
public class AverageOfArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n;i++) {
			sum = sum + arr[i];
		}
		sum = sum / n;
		System.out.println(sum);

	}

}
