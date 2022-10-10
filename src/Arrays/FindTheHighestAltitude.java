package Arrays;

//question link ->https://leetcode.com/problems/find-the-highest-altitude/

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}
