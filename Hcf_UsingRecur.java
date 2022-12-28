import java.util.*;
public class Hcf_UsingRecur {
	public static int Hcf(int a,int b) {
		if(b != 0)
			return Hcf(b, a % b);
		else
			return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int hcf = Hcf(n1,n2);
		System.out.println("HCF OF : "+n1+" "+n2+" = "+hcf);

	}

}
