package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(postorderTraversal(root.left));
        ans.addAll(postorderTraversal(root.right));
        ans.add(root.val);
        return ans;
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
