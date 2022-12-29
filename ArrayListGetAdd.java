import java.util.ArrayList;

public class ArrayListGetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(10);
	arr.add(20);
	arr.add(0,5);
	System.out.print(arr.get(0));
	System.out.println();
	
	for(int i = 0;i < arr.size();i++) {
		System.out.print(arr.get(i)+" ");
	 }
	System.out.println();
	
	for(int i : arr) { // for each loop
		System.out.print(i+" ");
	  }
	}

}
