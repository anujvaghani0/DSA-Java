package Strings;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        boolean[] notprime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notprime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notprime[i * j] = true;
                }
            }
        }
        return count;
    }
}
