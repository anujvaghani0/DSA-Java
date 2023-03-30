package Tree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputIsABST {
    public static void main(String[] args) {

    }

    private static Set<Integer> set = new HashSet<>();

    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        int value = root.val;
        if (set.contains(k - value)) {
            return true;
        }
        set.add(value);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

