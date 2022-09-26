package Matrix;

import java.util.Arrays;

public class RotatingTheBox {
    public static void main(String[] args) {
        char[][] box = {{'#', '.','*', '#' },
                {'#', '#','*', '.' }};
        char[][] ans = rotateTheBox(box);
        System.out.println(Arrays.deepToString(ans));
    }

    public static char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;
        char[][] ans = new char[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = box[row - 1 - i][j];
            }
        }

        for (int i = col - 1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                if (ans[i][j] == '#') {
                    int currentRow = i;
                    while (currentRow + 1 < col && ans[currentRow + 1][j] == '.') {
                        currentRow++;
                    }
                    if (currentRow != i) {
                        ans[currentRow][j] = '#';
                        ans[i][j] = '.';
                    }
                }
            }
        }
        return ans;
    }
}
