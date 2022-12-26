package Math;

// Question link -> https://leetcode.com/problems/number-of-ways-to-buy-pens-and-pencils/

public class NumberOfWaysToBuyPensAndPencils {
    public static void main(String[] args) {
        System.out.println(waysToBuyPensPencils(20, 10, 5));
    }

    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        for (int i = 0; i * cost1 <= total; i++) {
            ans += (total - (i * cost1)) / cost2 +1;
        }
        return ans;
    }
}
