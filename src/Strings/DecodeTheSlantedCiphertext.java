package Strings;

//question link -> https://leetcode.com/problems/decode-the-slanted-ciphertext/

public class DecodeTheSlantedCiphertext {
    public static void main(String[] args) {
        String encodedText = "iveo    eed   l te   olc";
        System.out.println(decodeCiphertext(encodedText, 4));
    }

    public static String decodeCiphertext(String encodedText, int rows) {
        int column = encodedText.length() / rows;
        char[][] arr = new char[rows][column];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = encodedText.charAt(counter);
                counter++;
            }
        }

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < column; i++) {
            int count = i;
            for (int j = 0; j < rows; j++) {
                if (count < column) {
                    temp.append(arr[j][count++]);
                }
            }
        }
        String result = temp.toString();
        return result.stripTrailing();
    }
}
