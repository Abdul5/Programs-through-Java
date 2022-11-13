import java.util.*;
public class BillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int k = sc.nextInt();
	      int arr[]= new int[n];
	      for(int i=0;i<n;i++)
	        {
	          arr[i]=sc.nextInt();
	        }
	        int b = sc.nextInt();
	        int sum=0;
	      
	        for(int i=0;i<n;i++)
	          {
	            if(i!=k)
	            {
	              sum=sum+arr[i];
	            }
	          }
	      
	      if((sum/2)==b)
	      {
	        System.out.println("Bon Appetit");
	      }
	      else{
	        System.out.println(b-(sum/2));
	      }

	}

}
