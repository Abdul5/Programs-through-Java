import java.util.*;
public class SerejaDimaLeftToRight_Sum {
	public static void sum(int side[], int n) {
		int left = 0,right = n - 1;
		int sereja = 0, dima = 0;
		boolean serejaTurn = true;
		while(left <= right) {
			int chooseSide = 0;
			if(side[left] > side[right]) {
				chooseSide = side[left];
				left++;
			}
			else {
				chooseSide = side[right];
				right--;
			}
			if(serejaTurn) {
				sereja += chooseSide;
			}
			else {
				dima += chooseSide;
			}
			serejaTurn = !serejaTurn;
		}
		System.out.print(sereja+" "+dima);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		sum(arr,n);

	}

}
