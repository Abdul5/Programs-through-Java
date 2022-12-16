import java.util.*;
public class ArrayRotateLeft_K_Times {
	public static void main(String[] args) throws Throwable {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    public static void rotateArray(int arr[], int n, int k) {
        // Write code here
		int mod = k % n;
        for (int i = 0; i < n; i++)
            System.out.print(arr[(i + mod) % n] + " ");
 
        System.out.println();
  }

}
