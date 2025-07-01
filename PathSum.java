/*Given the root of a binary tree and an integer targetSum,
return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.*/

public class PathSum {

    public static void main(String[] args) {
        int targetSum = 22;
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, targetSum));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == targetSum)
            return true;

        return (hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val));

    }
}