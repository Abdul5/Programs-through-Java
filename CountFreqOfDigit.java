import java.util.*;

class CountFreqOfDigit {

    static int FrequencyofDigits(long n, int d) {
        //Write your code here
        int c = 0;
            while(n > 0) {
            long dig = n % 10;
            n = n / 10;
            if(dig == d) {
                c++;
            }
            }
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        CountFreqOfDigit obj = new CountFreqOfDigit();
        System.out.println(obj.FrequencyofDigits(n, d));
    }
}