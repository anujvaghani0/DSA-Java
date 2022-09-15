package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> ans = commonChars(words);
        System.out.println(ans);
    }

    public static List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        StringBuilder ans1=new StringBuilder();


        int[] count=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        return ans;
    }
}
