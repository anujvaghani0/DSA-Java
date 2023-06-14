package Arrays;

public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
    String[] bank={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }

    public static int numberOfBeams(String[] bank) {
        int beams = 0;
        int previous_num = 0;
        int current_num = 0;
        for (int i = 0; i < bank.length; i++) {
            current_num = countOnces(bank[i]);
            beams += current_num * previous_num;
            if (current_num != 0) {
                previous_num = current_num;
            }
        }
        return  beams;
    }

    private static int countOnces(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return  count;
    }
}
