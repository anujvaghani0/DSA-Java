package Arrays;

//question link -> https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static void main(String[] args) {
        int[] startTime = {4};
        int[] endTime = {4};
        System.out.println(busyStudent(startTime, endTime, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
}
