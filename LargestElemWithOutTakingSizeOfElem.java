import java.util.*;
public class LargestElemWithOutTakingSizeOfElem {
	public static void main(String args[])throws java.lang.Exception {
        //your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		int A[] = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		int ans = A[0];
		for(int i = 0;i < A.length;i++) {
			ans = Math.max(ans, A[i]);
		}
		System.out.println(ans);
    }

}
