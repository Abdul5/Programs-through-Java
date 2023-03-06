import java.util.*;
public class Kth_MissingPositiveNum {
	public static int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-(mid+1)>=k)
                high=mid-1;
            else
                low=mid+1;
        }
        return low+k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.print(findKthPositive(arr,k));

	}

}

/* input :- 
5
2 3 4 7 11
k = 5

output :- 
9   

*/
