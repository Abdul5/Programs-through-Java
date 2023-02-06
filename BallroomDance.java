import java.util.*;
public class BallroomDance {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        int m = sc.nextInt();
	        int[] b = new int[m];
	        for (int i = 0; i < m; i++) {
	            b[i] = sc.nextInt();
	        }

	        Arrays.sort(a);
	        Arrays.sort(b);

	        int i = 0;
	        int j = 0;
	        int count = 0;
	        while (i < n && j < m) {
	            if (Math.abs(a[i] - b[j]) <= 1) {
	                count++;
	                i++;
	                j++;
	            } else if (a[i] < b[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }

	        System.out.println(count);
	    }
}
