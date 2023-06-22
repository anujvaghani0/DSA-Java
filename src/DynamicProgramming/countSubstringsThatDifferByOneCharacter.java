package DynamicProgramming;  

public class countSubstringsThatDifferByOneCharacter {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aba","baba"));
    }

    public static int countSubstrings(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                int x = i;
                int y = j;
                int differ = 0;

                while (x < s.length() && y < t.length()) {
                    if (s.charAt(x) != t.charAt(y)) {
                        differ++;
                    }
                    if (differ == 1) {
                        ans++;
                    }
                    if (differ == 2) {
                        break;
                    }
                    x++;
                    y++;
                }
            }
        }
    return ans;
    }
}
