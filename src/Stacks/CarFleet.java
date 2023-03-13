package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(12, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        car[] cars = new car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new car(position[i], speed[i]);
        }

//        sorting the car position in descending order
        Arrays.sort(cars, (a, b) -> b.position - a.position);

        Stack<Double> st = new Stack<>();
        for (car Car : cars) {

//            calculate the time it takes for each car to reach the target
            double time = (double) (target - Car.position) / Car.speed;

            if (st.empty() || st.peek() < time) {
                st.push(time);
            }
        }
        return st.size();
    }

    static class car {
        int position;
        int speed;

        public car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }
}
