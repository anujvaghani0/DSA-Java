package Arrays;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9};
        int[] arr2 = {8, 2, 5, 8};
        System.out.println(matchPlayersAndTrainers(arr1, arr2));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        int n = players.length;
        int m = trainers.length;
        int ans = 0;
        while (i < n && j < m) {
            if (players[i] <= trainers[j]) {
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}
