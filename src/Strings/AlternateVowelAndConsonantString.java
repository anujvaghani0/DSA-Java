package Strings;

public class AlternateVowelAndConsonantString {
    public static void main(String[] args) {
        System.out.println(rearrange("aeroplane", 9));
    }

    public static String rearrange(String s, int N) {
        int[] vowel = new int[26];
        int[] consonants = new int[26];
        int count1 = 0, count2 = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (vowel(s.charAt(i))) {
                vowel[s.charAt(i) - 'a']++;
                count1++;
            } else {
                consonants[s.charAt(i) - 'a']++;
                count2++;
            }
        }

        if (count2 > count1) {
            return "-1";
        }


        return ans.toString();

    }

    private static boolean vowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
