package DynamicProgramming.LeetcodeQuestions;

// Question link -> https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/

public class TimeNeededToRearrangeABinaryString {
    public static void main(String[] args) {
        System.out.println(secondsToRemoveOccurrences("0110101"));
    }

//    public static int secondsToRemoveOccurrences(String s) {
//        int zeros = 0;
//        int seconds = 0;
//        for (int i = 0; i < s.length(); i++) {
//            zeros += s.charAt(i) == '0' ? 1 : 0;
//            if (zeros > 0 && s.charAt(i) == '1') {
//                seconds = Math.max(seconds + 1, zeros);
//            }
//        }
//        return seconds;
//    }

//
    public static int secondsToRemoveOccurrences(String s) {
        int count = 0;
        int countAns = 0;
        int flag = 1;
        char[] temp = s.toCharArray();
        while (flag == 1) {
            flag = 0;
            for (int i = 0; i < temp.length - 1; i += count) {
                if (temp[i] == '0' && temp[i + 1] == '1') {
                    count = 2;
                    flag = 1;
                    temp[i]='1';
                    temp[i+1]='0';
                } else {
                    count = 1;
                }
            }
            if (flag == 1) {
                countAns++;
            }
        }
        return countAns;
    }
}