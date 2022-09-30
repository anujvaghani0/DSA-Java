package Strings;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int k = s.length() - 1;
        for (int i = 0; i < ch.length; i++) {
            if (checkVowel(ch[i])) {
                for (int j = k; j > 0; j--) {
                    if (checkVowel(ch[j]) && j > i) {
                        char temp = ch[j];
                        ch[j] = ch[i];
                        ch[i] = temp;
                        k--;
                        break;
                    } else {
                        k--;
                    }
                }
            }
        }
        return String.valueOf(ch);
    }

    public static boolean checkVowel(char s) {
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
                s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';
    }
}
