// Es 217 - Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> presentNum = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (presentNum.contains(nums[i])) {
                return true;
            }
            presentNum.add(nums[i]);
        }
        return false;
    }
}
