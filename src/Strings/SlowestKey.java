package Strings;

public class SlowestKey {
    public static void main(String[] args) {
        int[] num = {9, 29, 49, 50};
        System.out.println(slowestKey(num, "cbcd"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        int index = 0;
        int ans;
        for (int i = 1; i < releaseTimes.length; i++) {
            ans = releaseTimes[i] - releaseTimes[i - 1];
            if (ans > max || (ans == max && keysPressed.charAt(i) > keysPressed.charAt(index))) {
                max = ans;
                index = i;
            }
        }
        return keysPressed.charAt(index);
    }
}
