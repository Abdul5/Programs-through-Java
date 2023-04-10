import java.util.*;
public class SecondMostRepeatedWord {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String secondMostRepeatedWord = secFrequent(arr,n);
        System.out.println(secondMostRepeatedWord);
    }
    
    public static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        int max = Collections.max(hm.values());
        ArrayList<Integer> a = new ArrayList<>();
        for (Map.Entry<String, Integer> j : hm.entrySet()) {
            if (j.getValue() != max) {
                a.add(j.getValue());
            }
        }
        Collections.sort(a);
        for (Map.Entry<String, Integer> x : hm.entrySet()) {
            if (x.getValue() == a.get(a.size() - 1)) {
                return x.getKey();
            }
        }
        return "-1";
    }

}

/*
input :-
3
aa bb aa

output :-
bb

*/