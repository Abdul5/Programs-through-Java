import java.util.ArrayList;
public class ArrayListSetRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(40);
		arr.add(30);
		arr.set(1, 20);
		arr.remove(1);
		for(int i : arr) {
			System.out.print(i +" ");
		}
		

	}

}
