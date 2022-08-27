package Arrays;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(StrongNo(30));
    }
    public static int factorial(int n){
        int sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
    public static boolean StrongNo(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+factorial(digit);
            temp=temp/10;
        }
        if (sum==n){
            return true;
        }
        return false;
    }
}
