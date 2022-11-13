import java.util.*;
public class ArraysSort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0,b = 0,c = 0,i , j;
        for(i = 0; i < n; i++) {
            if(arr[i] == 0) {
                a++;
            }
            if(arr[i] == 1) {
                b++;
            }
            if(arr[i] == 2) {
                c++;
            }
        }
        i = 0;
        j = 0;
        while(j < a) {
            arr[i] = 0;
            i++;
            j++;
        }
        j = 0;
        while(j < b) {
            arr[i] = 1;
            i++;
            j++;
        }
        j = 0;
        while(j < c) {
            arr[i] = 2;
            i++;
            j++;
        }
        for(i = 0; i < n;i++) {
            System.out.print(arr[i]+" ");
        }

	}

}
