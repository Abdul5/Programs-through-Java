import java.util.*;
public class ArraysOccurCountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
        Arrays.sort(arr);
        int freq[] = new int[arr.length]; 
		int vis = -1;
		for(int i = 0; i < n;i++) {
         int count = 1;
          for(int j = i + 1;j < n;j++) {
            if(arr[i] == arr[j]) {
              count++;
              freq[j] = vis;
        }
      }
      if(freq[i] != vis) {
        freq[i] = count;
      }
    }
			for(int i = 0;i < freq.length;i++) {
        if(freq[i] != vis) {
          System.out.print(freq[i]+" ");
        }
      }

	}

}
