package Arrays;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
//    List<Integer>  list= Arrays.asList(1,2,3);
//    List<Integer>  list2= Arrays.asList(1,2,3);
//    List<List<Integer>> ans=list2+list;
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] ans = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                ans[j] = Math.min(ans[j], ans[j + 1]) + triangle.get(i).get(j);
            }
        }
        return ans[0];
    }
}
