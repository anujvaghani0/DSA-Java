package sorting;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
    int[] arr={4000,3000,1000,2000};
        System.out.println(slary(arr));

    }
    public static double slary(int[] arr){
        Arrays.sort(arr);
        double ans;
        double sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        ans=(arr[0]+arr[arr.length-1]);
        double finalAns=sum-ans;
        double v = finalAns /(arr.length-2);
        return v;
    }

}
