import java.util.*;
public class MagicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (sum > 9 || num > 0) {
			if(num == 0) {
				num = sum;
				sum = 0;
			}
			int temp = num % 10;
			sum += temp;
			num /= 10;
		}
		//System.out.println(sum);
		if(sum == 1) {
			System.out.println("num is magic");
		}
		else {
			System.out.println("num is not magic");
		}

	}

}
