package Arrays;

//question link -> https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        String[] words = {"apples", "i", "love", "leetcode"};
        System.out.println(isPrefixString("iloveleetcode", words));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            ans.append(word);
            if (s.equals(ans.toString())) {
                return true;
            }
            if (!s.contains(ans.toString())) {
                return false;
            }
        }
        return false;
    }
}
