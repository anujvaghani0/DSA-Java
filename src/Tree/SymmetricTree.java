package Tree;

public class SymmetricTree {
    public static void main(String[] args) {

    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricUtil(root.left, root.right);
    }

    private boolean isSymmetricUtil(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == root2;
        }

        return (root1.data == root2.data) && isSymmetricUtil(root1.left, root2.right) &&
                isSymmetricUtil(root1.right, root2.left);
    }


    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
