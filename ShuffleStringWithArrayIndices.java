import java.util.*;
public class ShuffleStringWithArrayIndices {
	public static void Shuffle(int arr[],int n, String str) {
		char ch[] = new char[n];
		for(int i = 0;i < n;i++) {
			ch[arr[i]] = str.charAt(i);
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		Shuffle(arr,n,str);

	}

}
