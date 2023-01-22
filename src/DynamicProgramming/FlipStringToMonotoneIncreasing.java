package DynamicProgramming;

public class FlipStringToMonotoneIncreasing {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("010110"));
    }

    public static int minFlipsMonoIncr(String s) {
        int ans = 0;
        int numberOdFlips = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                ans = Math.min(ans + 1, numberOdFlips);
            } else {
                numberOdFlips++;
            }
        }
        return ans;
    }
}
