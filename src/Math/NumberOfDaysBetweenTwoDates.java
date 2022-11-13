package Math;

//question link -> https://leetcode.com/problems/number-of-days-between-two-dates/

public class NumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    public static int daysBetweenDates(String date1, String date2) {
        int year = Integer.parseInt(date1.substring(0, 4));
        int months = Integer.parseInt(date1.substring(0, 4));
        int date = Integer.parseInt(date1.substring(0, 4));

        return 0;
    }
}
