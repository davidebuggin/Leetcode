// Es 219 - Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.*;

public class ContainsDuplicateII {
    public static void main(String args[]) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numAndPosition = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numAndPosition.containsKey(nums[i])) {
                if (Math.abs(i - numAndPosition.get(nums[i])) <= k) {
                    return true;
                }
            }
            numAndPosition.put(nums[i], i);
        }
        return false;
    }
}
