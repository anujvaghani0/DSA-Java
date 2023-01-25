package Math;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }

    public static String getPermutation(int n, int k) {
        int factorial = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
            numbers.add(i);
        }

        numbers.add(n);
        StringBuilder ans = new StringBuilder();
        k = k - 1;
        while (true) {
            ans.append(numbers.get(k / factorial));
            numbers.remove(k / factorial);
            if (numbers.size() == 0) {
                break;
            }

            k = k % factorial;
            factorial = factorial / numbers.size();
        }

        return ans.toString();
    }
}
