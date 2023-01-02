import java.util.*;
public class AllValid_IP_With_O_Of_One_TC {

	// Function to get all the valid ip-addresses
	static void GetAllValidIpAddress(ArrayList<String>result,
									String givenString,int index,
									int count, String ipAddress){

		// If index greater than givenString size
		// and we have four block
		if (givenString.length() == index && count == 4){

		// Remove the last dot
		ipAddress = ipAddress.substring(0,ipAddress.length()-1);

		// Add ip-address to the results
		result.add(ipAddress);
		return;
		}

		// To add one index to ip-address
		if (givenString.length() < index + 1)
		return;

		// Select one digit and call the
		// same function for other blocks
		ipAddress = (ipAddress + givenString.substring(index , index + 1) + '.');

		GetAllValidIpAddress(result, givenString, index + 1, count + 1, ipAddress);

		// Backtrack to generate another possible ip address
		// So we remove two index (one for the digit
		// and other for the dot) from the end
		ipAddress = ipAddress.substring(0,ipAddress.length() - 2);

		// Select two consecutive digits and call
		// the same function for other blocks
		if (givenString.length() < index + 2 ||
			givenString.charAt(index) == '0')
		return;

		ipAddress = ipAddress + givenString.substring(index,index + 2) + '.';
		GetAllValidIpAddress(result, givenString, index + 2,
							count + 1, ipAddress);

		// Backtrack to generate another possible ip address
		// So we remove three index from the end
		ipAddress = ipAddress.substring(0,ipAddress.length() - 3);

		// Select three consecutive digits and call
		// the same function for other blocks
		if (givenString.length() < index + 3 ||
			Integer.valueOf(givenString.substring(index,index + 3)) > 255)
		return;
		ipAddress += givenString.substring(index,index + 3) + '.';
		GetAllValidIpAddress(result, givenString,
							index + 3, count + 1, ipAddress);

		// Backtrack to generate another possible ip address
		// So we remove four index from the end
		ipAddress = ipAddress.substring(0,ipAddress.length()-4);
	}	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String givenString = sc.nextLine();

		// Fill result vector with all valid ip-addresses
		ArrayList<String>result = new ArrayList<String>() ;
		String ipAddress = "";
		GetAllValidIpAddress(result, givenString, 0, 0,ipAddress);

		// Print all the generated ip-addresses
		for(int i = 0; i < result.size(); i++)
		System.out.println(result.get(i));
	 }

}
