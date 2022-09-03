package Strings;

import java.util.Arrays;

public class sortStringArray {
    public static void main(String[] args) {
        String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
        String[] ans=sort(myArray);
        System.out.println(Arrays.toString(ans));
    }

    public static String[] sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
