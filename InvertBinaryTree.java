// Es 226 - Given the root of a binary tree, invert the tree, and return its root.

import java.util.*;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = invertTree(root);

        List<Integer> treeAsList = serializeTree(result);

        System.out.println(treeAsList);

    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null)
            return root;

        TreeNode temp = root.left;

        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static List<Integer> serializeTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                result.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                result.add(null);
            }
        }

        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
    }

}
