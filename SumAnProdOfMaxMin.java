import java.util.*;
public class SumAnProdOfMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       // int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
        }
        int max = arr[0],min = arr[0],sum = 0,mul = 0,temp = 0;
        
        // this code is for finding minimum
       /* 
         for(int i = 0;i < n;i++) {
                 for(int j = i+1; j < n;j++) {
                         if(arr[i] > arr[j]) {
                                 temp = arr[i];
                                 arr[i] = arr[j];
                                 arr[j] = temp;
                         }
                 }
         }  */
        
        // Arrays.sort(arr); // this is also for finding minimum
        
        for(int i = 0; i < n;i++) {
                if(arr[i] > max) {
                        max = arr[i];
                }
                else if(arr[i] < min) {
                        min = arr[i];
                }
        }
        // sum = arr[0] + max;
        // mul = arr[0] * max;
        sum = min + max;
        mul = min * max;
        System.out.println(sum+" "+mul);

	}

}
