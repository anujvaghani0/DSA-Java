package Strings;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int result = 0;
        int i = 0;
        int current;
        int next;
        while (i < n) {
            if (i == n - 1) {
                result += getInterger(s.charAt(i));
                return result;
            }
            current = getInterger(s.charAt(i));
            next = getInterger(s.charAt(i + 1));
            if (current >= next) {
                result += current;
                i++;
            } else {
                result += next - current;
                i += 2;
            }
        }
        return result;
    }


    private static int getInterger(char charAt) {
        switch (charAt) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
