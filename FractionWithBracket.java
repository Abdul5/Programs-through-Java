import java.util.*;
public class FractionWithBracket {
	    public static String fractionToDecimal(int numerator, int denominator) {
	        // Edge case: numerator is divisible by denominator
	        if (numerator % denominator == 0) {
	            return String.valueOf(numerator / denominator);
	        }

	        StringBuilder sb = new StringBuilder();
	        // Handle negative values
	        if ((numerator < 0) ^ (denominator < 0)) {
	            sb.append("-");
	        }

	        long num = Math.abs((long) numerator);
	        long den = Math.abs((long) denominator);

	        // Append whole part
	        sb.append(num / den);
	        sb.append(".");

	        num %= den;
	        // Use a map to store the seen remainders and their corresponding indices
	        HashMap<Long, Integer> map = new HashMap<>();
	        map.put(num, sb.length());

	        while (num != 0) {
	            num *= 10;
	            sb.append(num / den);
	            num %= den;

	            if (map.containsKey(num)) {
	                int index = map.get(num);
	                sb.insert(index, "(");
	                sb.append(")");
	                break;
	            } else {
	                map.put(num, sb.length());
	            }
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int numerator = sc.nextInt();
	        int denominator = sc.nextInt();
	        System.out.println(fractionToDecimal(numerator, denominator));
	    }

}
