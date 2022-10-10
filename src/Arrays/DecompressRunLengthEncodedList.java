package Arrays;

//question link -> https://leetcode.com/problems/decompress-run-length-encoded-list/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i+=2) {
            arrSize += nums[i];
        }

        int[] results = new int[arrSize];
        int startIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(results, startIndex, startIndex + nums[i], nums[i + 1]);
            startIndex += nums[i];
        }
        return results;


//        List<Integer> temp = new ArrayList<>();
//        int count = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            for (int j = 0; j < nums[i]; j++) {
//                temp.add(nums[i + 1]);
//                count++;
//            }
//        }
//
//        int[] ans = new int[count];
//        for (int i = 0; i < temp.size(); i++) {
//            ans[i] = temp.get(i);
//        }
//        return ans;
    }
}
