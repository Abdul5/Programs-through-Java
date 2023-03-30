import java.util.*;
public class PerimeterOfCircle {
		public static void main (String[] args) throws java.lang.Exception
		{
			//your code here
			Scanner sc = new Scanner(System.in);
			double area = sc.nextDouble(); // here i got value of area of circle 
	        
	        double radius = Math.sqrt(area / Math.PI);  // here i find radius
	        double perimeter = 2 * Math.PI * radius;    // here i find perimeter
	        
	        System.out.println(perimeter);
		}

}
