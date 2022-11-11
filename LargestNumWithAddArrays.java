import java.util.*;
public class LargestNumWithAddArrays {
	public static String LargeNum(int num[]) {
        String arr[] = new String[num.length];
        for(int i = 0;i < num.length;i++) {
                arr[i] = num[i] + "";
        }
        Arrays.sort(arr,(a,b)->{
        long n1 = Long.parseLong(a+b);   
        long n2 = Long.parseLong(b+a); 
      if(n1 > n2) {
                      return 1;
              }
        else if(n2 > n1) {
                return -1;
        }
        else {
                return 0;
        }
        });
        StringBuilder sb = new StringBuilder("");
   for(int i = arr.length-1; i >= 0;i--) {
           sb.append(arr[i]);
   }
     return sb.toString();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]nums = new int[n];

         for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

            System.out.println(LargeNum(nums));

	}

}
