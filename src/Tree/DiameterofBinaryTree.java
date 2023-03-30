package Tree;

public class DiameterofBinaryTree {
    public static void main(String[] args) {

    }

//    o(n)

    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo ans = diameter(root);
        return ans.diameter;
    }

    public TreeInfo diameter(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height;
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }


    // o(n^2)
//    through the root
//      element has included
    public static int diameterOfBinaryTree1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameterOfBinaryTree1(root.left);
        int diam2 = diameterOfBinaryTree1(root.right);
        int diam3 = maxDepth(root.left) + maxDepth(root.right) + 1;
        return Math.max(diam1, Math.max(diam2, diam3));
    }


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }


    public class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
