package BitwiseOperators;

public class OddandEven {
    public static void main(String[] args) {
        System.out.println(isOdd(68));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
