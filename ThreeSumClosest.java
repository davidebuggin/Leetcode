/* Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.*/

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closestSum - target);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return target;
                }

                int actDiff = Math.abs(sum - target);

                if (actDiff < minDiff) {
                    minDiff = actDiff;
                    closestSum = sum;
                }

                if (sum > target) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return closestSum;
    }
}
