package Strings;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }

    public static String interpret(String command) {
        int i = 0;
        StringBuilder s = new StringBuilder();
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                s.append('G');
                i += 1;
            } else if (command.charAt(i) == '(' && i + 1 < command.length() && command.charAt(i + 1) == ')') {
                s.append('o');
                i += 2;
            } else {
                s.append("al");
                i += 4;
            }
        }
        return s.toString();
    }
}

//  while(command.length()>i) {
//            if (command.charAt(i) == '(' || command.charAt(i) == ')') {
//                i++;
//                count++;
//            }else {
//                i++;
//            }
//        }
//        StringBuilder ans=new StringBuilder(command.length()-count);
//        int j=0;
//        while(command.length()>j) {
//            if (command.charAt(j) == '(' || command.charAt(j) == ')') {
//                j++;
//            }else {
//                ans.append(command.charAt(j));
//                j++;
//            }
//        }
