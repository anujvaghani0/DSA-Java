package Arrays;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
       Armstrong(l,m);
    }

    public static void Armstrong(int low, int high) {
        for (int num = low; num <= high; num++) {
            int temp;
            temp = num;
            int sum = 0;
            int size=size(num);
            while (temp != 0) {
                int digit = temp % 10;
                sum = sum +(int) (Math.pow(digit, size));
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.println(sum);
            }
        }
    }
    public static int size(int n){
        int leg=0;
        while(n!=0){
            leg++;
            n=n/10;
        }
        return leg;
    }
}
