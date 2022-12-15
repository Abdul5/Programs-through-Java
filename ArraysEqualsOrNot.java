import java.util.*;
public class ArraysEqualsOrNot {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0;i < n;i++) {
		arr1[i] = sc.nextInt();
		}
	    int arr2[] = new int[n];
	    for(int j = 0;j < n;j++) {
			arr2[j] = sc.nextInt();
		}
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    if(Arrays.equals(arr1,arr2)) {
			System.out.println("true");
		}
	    else {
			System.out.println("false");
		}
	 }

}
