import java.util.*;
public class PrintElemNot_In_Arr1_Or_Arr2 {
	public static ArrayList<Integer> PairArrUnique(int arr1[],int n,int arr2[],int m) {
		Set<Integer> hs = new HashSet<>();
		for(int i = 0;i < m;i++) {
			hs.add(arr2[i]);
		}
		ArrayList<Integer> li = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			if(!hs.contains(arr1[i])) {
				li.add(arr1[i]);
			}
		}
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[m];
		for(int j = 0;j < m;j++) {
			arr2[j] = sc.nextInt();
		}
		
		ArrayList<Integer> ans = PairArrUnique(arr1,n,arr2,m);
		for(int x : ans) {
			System.out.print(x+" ");
		}

	}

}



/*
 input :- 
5 5
4 3 5 9 11
4 9 3 11 10

output :- 
5

*/
