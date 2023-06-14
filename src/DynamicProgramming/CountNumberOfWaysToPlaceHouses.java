package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/count-number-of-ways-to-place-houses/

//The number of way on one side is fibonacci  sequence.
//return fibonacci  * fibonacci  in the end.

public class CountNumberOfWaysToPlaceHouses {
    public static void main(String[] args) {
        System.out.println(countHousePlacements(2));
    }

    public static int countHousePlacements(int n) {
        int mod = (int) 1e9 + 7;
        int a = 1;
        int b = 1;
        int c = 2;
        for (int i = 0; i < n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }
        return (int) (((long) b * b) % mod);
    }
}
