package Sorting;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {1, 1, 3, 3};
        System.out.println(numRescueBoats(people, 3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int ans = 0;
        while (i <= j) {
            int sum = people[i];
            if (i != j) {
                sum += people[j];
            }
            if (sum <= limit) {
                i++;
            }
            ans++;
            j--;
        }
        return ans;
    }
}
