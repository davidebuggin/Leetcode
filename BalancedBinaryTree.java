//Given a binary tree, determine if it is height-balanced.

public class BalancedBinaryTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        if(getHeight(root) == -1) {
            return false;
        } else {
           return true; 
        }

    }

    private static int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        int heightLeft = getHeight(node.left);
        if (heightLeft == -1) {
            return -1;
        }
        int heightRight = getHeight(node.right);
        if (heightRight == -1) {
            return -1;
        }

        if (Math.abs(heightLeft - heightRight) > 1) {
            return -1;
        }

        return 1 + Math.max(heightLeft, heightRight);
    }

}
