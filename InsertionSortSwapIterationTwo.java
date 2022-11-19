import java.util.*;
public class InsertionSortSwapIterationTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[]=new int[n];
        boolean check=false;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int var=ar[n-1];
        for(int i=n-2;i>=-1;i--)
        {
            if(i!=-1)
            {
               if(var < ar[i])
              {
                ar[i+1]=ar[i];
              }
               else
              {
                ar[i+1]=var;
                check=true;
              }
            }
            else
            {
                ar[0]=var;
            }
            for(int j=0;j<n;j++)
                System.out.print(ar[j]+" ");
            System.out.println();
            if(check)
                break;
        }

	}

}
