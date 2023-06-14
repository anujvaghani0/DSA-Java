package Arrays;

import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return  ans;
    }
}
