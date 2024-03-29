import java.util.*;
public class QuickSortPrintPartitionAndMerge {
	public void solve(int arr[],int n) { 
        quickSort(arr,n); 
        
    } 
    public static int[] quickSort(int a[], int n){ 
        int cnt = 0; 
        for(int i = 1; i < n; i++){ 
            if(a[i] < a[0]) 
            cnt++;
            } 
            int left[] = new int[cnt]; 
            int right[] = new int[n - cnt - 1]; 
            int j = 0, k = 0; 
            for(int i = 1; i < n; i++){ 
                if(a[i] < a[0]){ 
                    left[j] = a[i]; 
                    j++; 
                }
                else{ 
                    right[k] = a[i]; 
                    k++; 
                } 
            } if(cnt > 1) 
            left = quickSort(left, cnt); 
            if(n - cnt - 1 > 1) 
            right = quickSort(right, n - cnt - 1); 
            int pivot = a[0]; 
            a = new int[n]; 
            j = 0; 
            for(int i = 0; i < cnt; i++){ 
                a[j] = left[i]; j++; 
            } 
            a[j] = pivot; 
            j++; 
            for(int i = 0; i < n - cnt - 1; i++){ 
                a[j] = right[i];
                j++;
                } 
                for(int i = 0; i < n; i++){ 
                    System.out.print(a[i] + " ");
                    }
                    System.out.println("");
                    return a;
    }
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i] = input.nextInt();
    }
    QuickSortPrintPartitionAndMerge obj=new QuickSortPrintPartitionAndMerge();
    obj.solve(a, n);
  }

}