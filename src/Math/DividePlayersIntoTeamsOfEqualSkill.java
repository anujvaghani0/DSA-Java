package Math;

// Question link -> https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/

import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkill {
    public static void main(String[] args) {
        int[] skills = {3, 2, 5, 1, 3, 4};
        System.out.println(dividePlayers(skills));
    }

    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int temp = skill[0] + skill[n - 1];
        int i = 0;
        int j = n - 1;
        long ans = 0;
        while (i < j) {
            if (skill[i] + skill[j] == temp) {
                ans += (long) skill[i] * skill[j];
            } else {
                return -1;
            }
            i++;
            j--;
        }
        return ans;
    }
}
