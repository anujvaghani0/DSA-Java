package Arrays;

public class ValidBoomerang {
    public static void main(String[] args) {
    int[][] points={{1,1},{2,3},{3,2}};
        System.out.println(isBoomerang(points));
    }

    public static boolean isBoomerang(int[][] points) {
        return (points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) !=
                (points[0][0] - points[2][0]) * (points[0][1] - points[1][1]);
    }
}
