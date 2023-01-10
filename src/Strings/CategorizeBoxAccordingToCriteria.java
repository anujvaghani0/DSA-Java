package Strings;

public class CategorizeBoxAccordingToCriteria {
    public static void main(String[] args) {
        System.out.println(categorizeBox(10000, 1, 1, 1));
    }

    public static String categorizeBox(int length, int width, int height, int mass) {
        long values = 1000000000;
        long volume = (long) length * width * height;
        String temp1 = "";
        String temp2 = "";
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= values) {
            temp1 = "Bulky";
        }

        if (mass >= 100) {
            temp2 = "Heavy";
        }

        if (temp1.equals("Bulky") && temp2.equals("Heavy")) {
            return "Both";
        } else if (!temp1.equals("Bulky") && !temp2.equals("Heavy")) {
            return "Neither";
        } else if (temp1.equals("Bulky")) {
            return "Bulky";
        } else {
            return "Heavy";
        }
    }
}
