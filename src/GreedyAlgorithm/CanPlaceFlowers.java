package GreedyAlgorithm;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (isPlotEmpty(flowerbed, i - 1) && isPlotEmpty(flowerbed, i + 1)) {
                    flowerbed[i] = 1;
                    if (--n == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isPlotEmpty(int[] flowerbed, int i) {
        return (i < 0) || (i >= flowerbed.length) || (flowerbed[i] == 0);
    }
}
