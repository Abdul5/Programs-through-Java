import java.util.*;
public class ArrayBuildingCountHeight {
		public static void main (String[] args) {
	                      // Your code here
			Scanner sc = new Scanner(System.in);
			int buld=sc.nextInt();
			long a[]=new long[buld];
			for(int i=0;i<buld;i++){
				a[i]=sc.nextLong();
			}
			//Arrays.sort()
			int count=1;
			long max=a[0];
			for(int i=1;i<buld;i++){
				
					if(max<a[i]){
						count++;
						max=a[i];
					}
			}
	       System.out.print(count);
		}

}
