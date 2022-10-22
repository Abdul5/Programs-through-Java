import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		/* this whole program is for each element word count
		char ch[] = str.toCharArray();
		for(int i = 0; i < ch.length;i++) {
			String s = "";
			while(i < ch.length && ch[i] != ' ') {
				s += ch[i];
				i++;
			}
			if(s.length() > 0) {
				System.out.print(s.length()+" ");
			}
		}  */
		
		int c = 1;
		for(int i = 0; i < str.length()-1;i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1) != ' ') {
				c++;
			}
		}
		System.out.println(c);

	}

}
