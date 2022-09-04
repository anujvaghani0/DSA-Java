package Strings;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern="FoBaT";
        System.out.println(camelMatch(queries,pattern));
    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            if (isCheck(queries[i], pattern)) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    private static boolean isCheck(String query, String pattern) {
        int i = 0;
        for (int j = 0; j < query.length(); j++) {
            if (i < pattern.length() && query.charAt(j) == pattern.charAt(i)) {
                i++;
            } else if (query.charAt(j) >= 'A' && query.charAt(j) <= 'Z') {
                return false;
            }
        }
        if (i == pattern.length()) {
            return true;
        }
    return false;
    }
}
