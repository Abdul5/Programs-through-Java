import java.util.*;
public class ThirdLargestElemInArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++) {
			for(int j = i+1;j < n;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print(arr[n-3]);//only we need to change here for largest,second largest,third largest...etc
	}

}
/*
 Input:
5
1 34 2 56 24

Output :
24

*/