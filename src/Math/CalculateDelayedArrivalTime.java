package Math;

public class CalculateDelayedArrivalTime {
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(15,12));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int finished = arrivalTime + delayedTime;
        return finished % 24;
    }
}
