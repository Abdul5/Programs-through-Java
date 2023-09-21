import java.util.*;
public class FirstAndLastIndexOfTargetValue {
	    public static ArrayList<Integer> res(int arr[],int t) {
	        ArrayList<Integer> list = new ArrayList<>(2);
	        int n = arr.length;
	        int f = -1;
	        int l = -1;
	        int i;
	        //for finding of first occurance index
	        for(i = 0;i < n;i++) {
	            if(arr[i] == t) {
	                f = i;
	                break;
	            }
	        }
	        // for finding of last occurance index
	        for(i = n-1;i >= 0;i--) {
	            if(arr[i] == t) {
	                l = i;
	                break;
	            }
	        }
	        list.add(f);
	        list.add(l);
	        return list;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0;i < n;i++) {
	            arr[i] = sc.nextInt();
	        }
	        int t = sc.nextInt();
	        //System.out.print(res(arr,t));
	        ArrayList<Integer> list = res(arr,t);
	        System.out.print(list.get(0)+" "+list.get(1));
	    }
}
