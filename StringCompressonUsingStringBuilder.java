import java.util.*;
public class StringCompressonUsingStringBuilder {
	public static String Compress(String str) {
		int n = str.length();
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < n;i++) {
			//if i reaches at the end then append all and break the loop
			if(i == str.length() - 1) {
				sb.append(str.charAt(i)+""+count);
				break;
			}
			//if two successive chars are equal then increase the counter
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				//else append character with its count
				sb.append(str.charAt(i)+""+count);
				count = 1;
			}
		}
		//String representation of a StringBuilder object
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Compress(str));

	}

}

/*
 input :
aaabb

output :
a3b2

*/