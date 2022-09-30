package Strings;

public class SolveTheEquation {
    public static void main(String[] args) {
//        System.out.println(solveEquation("x+5-3+x=6+x-2"));
        System.out.println(solveEquation("2x=x"));
    }

    public static String solveEquation(String equation) {
        String[] parts = equation.split("=");
        String leftParts = parts[0];
        String rightParts = parts[1];
        int[] leftValues = evaluate(leftParts);
        int[] RightValues = evaluate(rightParts);
        int currentX = leftValues[0] - RightValues[0];
        int currentNumber = leftValues[1] - RightValues[1];
         if (currentX == 0) {
            if (currentNumber != 0) {
                return "No solution";
            }
            return "Infinite solutions";
        }
        int valuesX = (-currentNumber) / currentX;
        return "x=" + valuesX;
    }

    private static int[] evaluate(String expressions) {
        int[] ans = new int[2];
        String[] expressionElements = expressions.split("(?=[-+])");
        for (String elements : expressionElements) {
            if (elements.equals("+x") || elements.equals("x")) {
                ans[0]++;
            } else if (elements.equals("-x")) {
                ans[0]--;
            } else if (elements.contains("x")) {
                ans[0] += Integer.parseInt(elements.substring(0, elements.indexOf("x")));
            } else {
                ans[1] += Integer.parseInt(elements);
            }
        }
        return ans;
    }
}