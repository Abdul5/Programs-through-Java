import java.util.*;
class Accio {
	    public void minOperations(int[] arr) {
	        int n = arr.length;
	        Arrays.sort(arr);
	        int c = 1;
	        int op = 1;
	        for(int i = 1; i < n;i++) {
	            if(arr[i] == arr[i-1]) {
	                c++;
	            }
	            else {
	                c = 1;
	            }
	            op = Math.max(op,c);
	        }
	        System.out.println(n-op);
	    }
	}

	public class ArrayMinOperation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t > 0) {
	            int n = sc.nextInt();
	            int[] arr = new int[n];
	            for (int i = 0; i < n; ++i)
	                arr[i] = sc.nextInt();
	            Accio Obj = new Accio();
	            Obj.minOperations(arr);
	            t--;
	        }
	        sc.close();
	    }
}
