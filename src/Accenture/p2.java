package Accenture;

public class p2 {
    public static void main(String[] args) {
        System.out.println(count("1C0C1C1A0B1"));
    }

    public static int count(String s) {
        int first = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            char middle = s.charAt(i);
            i++;
            if (middle == 'A') {
                first = first & (s.charAt(i) - '0');
            } else if (middle == 'B') {
                first = first | (s.charAt(i) - '0');
            }else{
                first = first ^ (s.charAt(i) - '0');
            }
        }
        return first;
    }
}