import java.util.*;
public class ArrayProductSign {
	    public static int arraySign(int[] nums) {
	    int prod = 1;

	    for (int n : nums) {
	      if (n == 0) return 0;
	      prod *= n > 0 ? 1 : -1;
	    }
	    return prod;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(arraySign(arr));

	}

}
