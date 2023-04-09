package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        int[] frequency = new int[26];
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int mostFrequency = 0;
        while (right < s.length()) {
            mostFrequency = Math.max(mostFrequency, ++frequency[arr[right] - 'A']);
            int canBeReplaced = (right - left + 1) - mostFrequency;
            if (canBeReplaced > k) {
                frequency[arr[left++] - 'A']--;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
