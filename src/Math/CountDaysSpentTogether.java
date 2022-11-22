package Math;

// Question link -> https://leetcode.com/problems/count-days-spent-together/

import java.time.LocalDate;

public class CountDaysSpentTogether {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        LocalDate d1 = LocalDate.of(2022, Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3, 5)));
        LocalDate d2 = LocalDate.of(2022, Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3, 5)));
        LocalDate d3 = LocalDate.of(2022, Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3, 5)));
        LocalDate d4 = LocalDate.of(2022, Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3, 5)));
        long aArrive = d1.toEpochDay();
        long aLeft = d2.toEpochDay();
        long bArrive = d3.toEpochDay();
        long bLeft = d4.toEpochDay();
        if (aLeft < bArrive || bLeft < aArrive) {
            return 0;
        }
        return (int) ((Math.min(aLeft, bLeft) - Math.max(aArrive, bArrive)) + 1);
    }
}
