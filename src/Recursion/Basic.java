package Recursion;

public class Basic {
    public static void main(String[] args) {
        message();
    }

    public static void message() {
        System.out.println("Hello world");
        message1();
    }

    public static void message1() {
        System.out.println("Hello world");
        message2();
    }

    public static void message2() {
        System.out.println("Hello world");
        message3();
    }

    public static void message3() {
        System.out.println("Hello world");
        message4();
    }

    public static void message4() {
        System.out.println("Hello world");

    }
}
