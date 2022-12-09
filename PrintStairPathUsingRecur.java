import java.util.*;
public class PrintStairPathUsingRecur {
	static void printStairPaths(int n,String psf) {
        //Write your code here
		if (n <= 0) {
      if (n == 0) {
        System.out.println(psf);
      }

      return;
    }

    printStairPaths(n - 1, psf + 1);
    printStairPaths(n - 2, psf + 2);
    printStairPaths(n - 3, psf + 3);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }

}
