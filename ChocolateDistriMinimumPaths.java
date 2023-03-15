import java.util.*;
public class ChocolateDistriMinimumPaths {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt(); // number of test cases
	        while (t-- > 0) {
	            int n = scanner.nextInt(); // number of packets of chocolate
	            int m = scanner.nextInt(); // number of students
	            int[] chocolates = new int[n]; // array of chocolate packets
	            for (int i = 0; i < n; i++) {
	                chocolates[i] = scanner.nextInt();
	            }
	            Arrays.sort(chocolates); // sort the chocolate packets in ascending order
	            int minDiff = Integer.MAX_VALUE; // initialize the minimum difference to maximum integer value
	            for (int i = 0; i <= n - m; i++) {
	                int diff = chocolates[i + m - 1] - chocolates[i]; // calculate the difference between the maximum and minimum chocolate packets for the current distribution
	                if (diff < minDiff) {
	                    minDiff = diff;
	                }
	            }
	            System.out.println(minDiff);
	        }
	        scanner.close();
	    }
}
