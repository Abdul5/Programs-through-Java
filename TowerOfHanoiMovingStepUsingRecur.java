import java.util.*;
public class TowerOfHanoiMovingStepUsingRecur {
	public static void toh(int n,int sc,int aux, int dest) {
		if(n > 0) {
			toh(n-1,sc,dest,aux);
			System.out.println("Moving disc "+n+" from "+sc+" rod to "+dest);
			toh(n-1,aux,sc,dest);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n,1,2,3);

	}

}
