package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        ans.addAll(inorderTraversal(root.left));
        ans.add(root.val);
        ans.addAll(inorderTraversal(root.right));

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
