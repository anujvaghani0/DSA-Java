package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] word = {"leetcoder", "leetcode", "od", "hamlet", "am"};
        List<String> ans = stringMatching(word);
        System.out.println(ans);
    }

    public static List<String> stringMatching(String[] words) {
        Arrays.sort(words, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            int j = i + 1;
            while (j < words.length) {
                int index = words[j].indexOf(words[i]);
                j++;
                if (index != -1) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}
