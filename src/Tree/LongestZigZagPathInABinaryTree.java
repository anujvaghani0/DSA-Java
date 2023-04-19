package Tree;

public class LongestZigZagPathInABinaryTree {
    public static void main(String[] args) {

    }

    static int ans = 0;

    public static int longestZigZag(TreeNode root) {
//        it not has zigzag path in a binary tree
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        solver(root.left, 1, "left");
        solver(root.right, 1, "right");
        return ans - 1;
    }

    private static void solver(TreeNode root, int temp, String dir) {
        ans = Math.max(ans, temp);
        if (root == null) {
            return;
        }

//    left side
        if (dir.equals("left")) {
            solver(root.right, temp + 1, "right");
            solver(root.left, 1, "left");
        }

//        right side
        if (dir.equals("right")) {
            solver(root.right, 1, "right");
            solver(root.left, temp + 1, "left");
        }
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
