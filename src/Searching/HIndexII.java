package Searching;

public class HIndexII {
    public static void main(String[] args) {

    }

    public static int hIndex(int[] citations) {
    int start=0;
    int end=citations.length-1;
    int mid=(start)-(end-start)/2;
    return mid+1;
    }
}
