package Arrays;

public class MaximumEnemyFortsThatCanBeCaptured {
    public static void main(String[] args) {
        int[] forts = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        System.out.println(captureForts(forts));
    }

    public static int captureForts(int[] forts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < forts.length - 1; i++) {
            int count = 0;
            if (forts[i] == 1) {
                for (int j = i + 1; j < forts.length - 1; j++) {
                    if (forts[j] == 0) {
                        count++;
                    } else if (forts[j] == -1) {
                        max = Math.max(count, max);
                        i = j;
                        break;
                    }
                }
            }
        }
        return  max;
    }
}
