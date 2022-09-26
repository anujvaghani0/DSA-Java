package Strings;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B00R6R0R6G9"));
    }

    public static int countPoints(String rings) {
        int[] Red = new int[10];
        int[] Green = new int[10];
        int[] Blue = new int[10];
        int n = rings.length();
        for (int i = 0; i < n; i += 2) {
            int a = rings.charAt(i + 1) - '0';
            if (rings.charAt(i) == 'R') {
                Red[a]++;
            } else if (rings.charAt(i) == 'B') {
                Blue[a]++;
            } else if (rings.charAt(i) == 'G') {
                Green[a]++;
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (Red[i] > 0 && Green[i] > 0 && Blue[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
