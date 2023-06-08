package Math;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("123"));
    }

    public static String removeTrailingZeros(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                break;
            } else {
                num = num.substring(0, i);
            }
        }
        return num;
    }
}
