package Arrays;

public class FindtheSumofFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(naturalNumber(10));
    }
    public static int naturalNumber(int n){
        int sum=0;

        for (int i=0;i<n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
