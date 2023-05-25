package Math;

import java.util.ArrayList;

public class ThekthFactorOfN {
    public static void main(String[] args) {
        System.out.println(kthFactor(7, 28));
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                temp.add(i);
            }
        }

        if (temp.size() >= k) {
            return temp.get(k - 1);
        }

        return -1;
    }
}
