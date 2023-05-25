package Accenture;

import java.util.Arrays;

public class p12 {
    public static void main(String[] args) {
        int[] temp = {1, 2, 5, 6, 4, 7, 8, 9, 11, 10, 12, 16, 13, 14, 15, 17, 18, 19, 20};
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == i + 1) {
                continue;
            } else {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
