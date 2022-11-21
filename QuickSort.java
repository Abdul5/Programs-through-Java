import java.util.*;
public class QuickSort {
	public static int Part(int arr[],int low,int high) {
        int pi = arr[high];
        int i = low-1;
        for(int j = low;j < high;j++) {
            if(arr[j] < pi) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pi;
        arr[high] = temp;
        
        return i;
    }
    public static void Quick(int arr[],int low,int high) {
        if(low < high) {
            int pi = Part(arr,low,high);
            Quick(arr,low,pi-1);
            Quick(arr,pi+1,high);
            
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Quick(arr,0,n-1);
        for(int j = 0;j < n;j++) {
            System.out.print(arr[j]+" ");
        }
    }

}
