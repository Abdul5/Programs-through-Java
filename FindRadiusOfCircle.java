import java.util.*;
public class FindRadiusOfCircle {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double perimeter = input.nextDouble();
	        double radius = perimeter / (2 * Math.PI);
	        System.out.println(radius);
	    }
}
