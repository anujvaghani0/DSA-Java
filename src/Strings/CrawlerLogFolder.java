package Strings;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] arr = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println(minOperations(arr));
    }

    public static int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                depth--;
                if (depth < 0) {
                    depth = 0;
                }
            } else {
                depth++;
            }
        }
        return depth;
    }
}