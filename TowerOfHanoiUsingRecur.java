import java.util.*;
public class TowerOfHanoiUsingRecur {
	public static void TOH(int n,char sc, char aux, char dest) {
		if(n > 0) {
			TOH(n - 1,sc,dest,aux);
			System.out.println("Moving Disc "+n+" from "+sc+" to "+dest);
			TOH(n - 1,aux,sc,dest);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TOH(n,'A','B','C');

	}

}
