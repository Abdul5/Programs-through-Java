import java.util.*;
public class Print_IndexOf_Target_Element {
	    public static void main(String[] args) {
	        int[][] arr = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
	        Scanner sc = new Scanner(System.in);
	        int element = sc.nextInt();
	        sc.close();

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] == element) {
	                    System.out.println(i + " " + j);
	                    return;
	                }
	            }
	        }
	    }
}
