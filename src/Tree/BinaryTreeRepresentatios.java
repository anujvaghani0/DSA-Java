package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeRepresentatios {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        preorder(root);
//        inorder(root);
//        postOrder(root);
        levelOrder(root);
    }

    public static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //    Tree Traversals

    //    Preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //  Inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //  Postorder
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //    Level Order
    public static void levelOrder(Node root) {
        Queue<Node> qu = new LinkedList<>();
        if (root == null) {
            return;
        }

        qu.add(root);
        qu.add(null);
        while (!qu.isEmpty()) {
            Node current = qu.remove();
            if (current == null) {
                System.out.println();
//                Queue empty
                if (qu.isEmpty()) {
                    break;
                } else {
                    qu.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.left != null) {
                    qu.add(current.left);
                }
                if (current.right != null) {
                    qu.add(current.right);
                }
            }
        }
    }


    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
