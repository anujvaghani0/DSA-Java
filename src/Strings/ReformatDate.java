package Strings;

public class ReformatDate {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
    }

    public static String reformatDate(String date) {
        String day = date.substring(0, 2);
        if (!Character.isDigit(day.charAt(1))) {
            day = date.substring(0, 1);
        }
        if (day.length() == 1) {
            day = "0" + day;
        }
        String[] input = date.split(" ");
        String month = input[1];
        String m = switch (month) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "";
        };
        String y = input[2];
        StringBuilder ans = new StringBuilder(y);
        ans.append("-");
        ans.append(m);
        ans.append("-");
        ans.append(day);
        return ans.toString();
    }
}
