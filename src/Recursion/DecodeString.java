package Recursion;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    static int index = 0;

    public static String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        String temp_string = "";
        int count = 0;
        while (index < s.length()) {
            char c = s.charAt(index++);
            if (c == '[') {
//                do subProblem
                temp_string = decodeString(s);
                for (int i = 0; i < count; i++) {
                    ans.append(temp_string);
                }
//                reset count
                count = 0;
//                subProblem completed
            } else if (c == ']') {
                break;
            } else if (Character.isAlphabetic(c)) {
                ans.append(c);
            } else {
                count = count * 10 + c - '0';
            }
        }
        return ans.toString();
    }
}
