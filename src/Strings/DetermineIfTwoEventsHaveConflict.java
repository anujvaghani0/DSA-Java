package Strings;

public class DetermineIfTwoEventsHaveConflict {
    public static void main(String[] args) {
        String[] event1 = {"10:00","11:00"};
        String[] event2 = {"14:00","15:00"};
        System.out.println(haveConflict(event1, event2));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        int firstStart = min(event1[0]);
        int firstEnd = min(event1[1]);
        int lastStart = min(event2[0]);
        int lastEnd = min(event2[1]);

        if (lastStart > firstEnd || firstStart > lastEnd) {
            return false;
        }
        return true;
    }

    private static int min(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3));
    }
}
