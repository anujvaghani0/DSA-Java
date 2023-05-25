package Accenture;

import java.util.ArrayList;

public class p8 {
    public static void main(String[] args) {
        System.out.println(dectoNBase(12, 718));
    }

    public static String dectoNBase(int n, int num) {
        String ans = "";
        int quotient = num / n;
        ArrayList<Integer> reminder = new ArrayList<>();
        reminder.add(num % n);
        while (quotient != 0) {
            reminder.add(quotient % n);
            quotient = quotient / n;
        }
        for (int i = 0; i < reminder.size(); i++) {
            if (reminder.get(i) > 9) {
                ans = (char) (reminder.get(i) - 9 + 64) + ans;
            } else {
                ans = reminder.get(i) + ans;
            }
        }
        return ans;
    }
}
