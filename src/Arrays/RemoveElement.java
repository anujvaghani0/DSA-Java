package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
    int[] nums={3,2,3,2};
    int target=3;
        System.out.println(removeElement(nums,target));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
