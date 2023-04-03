package Arrays;

public class FindTheLongestBalancedSubstringofABinaryString {
    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        int i = 0;
        int ans = 0;
        while (i < s.length()) {
            int count0 = 0;
            int count1 = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                count0++;
                i++;
            }

            while (i < s.length() && s.charAt(i) == '1') {
                count1++;
                i++;
            }

            int count = Math.min(count1, count0);
            ans = Math.max(ans, 2 * count);
        }
        return ans;
    }
}

