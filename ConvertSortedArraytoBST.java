import java.util.*;

public class ConvertSortedArraytoBST {
    public static void main(String[] args) {

        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode root = sortedArrayToBST(nums);

        List<Integer> treeAsList = serializeTree(root);
        System.out.println(treeAsList);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);

        int[] leftPart = Arrays.copyOfRange(nums, 0, mid);
        root.left = sortedArrayToBST(leftPart);

        int[] rightPart = Arrays.copyOfRange(nums, mid + 1, nums.length);
        root.right = sortedArrayToBST(rightPart);

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
