import java.util.*;
public class AllElementGre20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0; i < n;i++) {
            if(arr[i] > 20) {
                c++;
            }
        }
        System.out.print(c);

	}

}
