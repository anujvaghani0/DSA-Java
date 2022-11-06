package Arrays;

//question link -> https://leetcode.com/problems/1-bit-and-2-bit-characters/

public class OnebitAnd2bitCharacters {
    public static void main(String[] args) {
        int[] bits = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i++;
            }
        }
        return i == bits.length - 1;
    }
}
