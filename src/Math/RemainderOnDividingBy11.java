package Math;

public class RemainderOnDividingBy11 {
    public static void main(String[] args) {
        System.out.println(xmod11("1345"));
    }

    public static int xmod11(String x) {
        int odd = 0;
        int even = 0;
        int index = 0;
        while (index < x.length()) {
            if (index % 2 == 0) {
                even += Integer.parseInt(String.valueOf(x.charAt(index++)));
            } else {
                odd += Integer.parseInt(String.valueOf(x.charAt(index++)));
            }
        }
        int difference = Math.abs(even - odd);
        if (difference == 0) {
            return 0;
        }
        return difference % 11;
    }
}
