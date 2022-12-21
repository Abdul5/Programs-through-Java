import java.util.*;
public class StringReverseWordInSamePlace {
	public static void reverseWords(String str){
        String arr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < arr.length;i++) {
			for(int j = arr[i].length() - 1;j >= 0;j--)
				sb.append(arr[i].charAt(j));
			if(i != arr.length - 1) 
				sb.append(" ");
		}
		System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        reverseWords (s);
    }

}
