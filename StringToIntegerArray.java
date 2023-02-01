import java.util.*;
public class StringToIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1[] = str.split(",");
		for(int i = 0;i < str1.length;i++) {
			System.out.print(Integer.parseInt(str1[i])+" ");
		}

	}

}
