package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = fizzBuzz(n);
        System.out.println(ans);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int f = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            f++;
            b++;
            if (f == 3 && b == 5) {
                ans.add("FizzBuzz");
                f = 0;
                b = 0;
            } else if (f == 3) {
                ans.add("Fizz");
                f = 0;
            } else if (b == 5) {
                ans.add("Buzz");
                b = 0;
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
