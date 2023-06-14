package Arrays;

//question link -> https://leetcode.com/problems/maximum-population-year/

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] arr = {{1993, 1999}, {2000, 2010}};
        System.out.println(maximumPopulation(arr));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] years = new int[2051];
        for (int[] log : logs) {
            years[log[0]] += 1;
            years[log[1]] -= 1;
        }
        int maxNumber = years[1950];
        int maxYears = 1950;
        for (int i = 1951; i < years.length; i++) {
            years[i] += years[i - 1];
            if (years[i] > maxNumber) {
                maxNumber = years[i];
                maxYears = i;
            }
        }
        return  maxYears;
    }
}
