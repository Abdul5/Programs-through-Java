import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int lar = Integer.MIN_VALUE;
        int Selar = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++) {
            if(arr[i] > lar) {
                Selar = lar;
                lar = arr[i];
            }
            else if(arr[i] > Selar && arr[i] != lar) {
                Selar = arr[i];
            }
        }
        System.out.println(Selar);

	}

}
