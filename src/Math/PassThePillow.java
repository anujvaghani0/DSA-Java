package Math;

public class PassThePillow {
    public static void main(String[] args) {
        System.out.println(passThePillow(4, 5));
    }

    public static int passThePillow(int n, int time) {
        int dig = 1;
        while (true) {
            dig = 1;
            while (time > 0 && dig < n) {
                dig++;
                time--;
                if (dig == n) {
                    break;
                }
            }

//            checking time is 0 or not
            if (time <= 0) {
                break;
            }

            while (time > 0 && dig > 0) {
                dig--;
                time--;
                if (dig == 1) {
                    break;
                }
            }

            if (time <= 0) {
                break;
            }
        }
        return dig;
    }
}
