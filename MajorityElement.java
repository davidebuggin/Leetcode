/* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majorNum = 0;
        Map<Integer, Integer> numsOccurencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsOccurencyMap.containsKey(nums[i])) {
                numsOccurencyMap.put(nums[i], numsOccurencyMap.get(nums[i]) + 1);
            } else {
                numsOccurencyMap.put(nums[i], 1);
            }
            if (numsOccurencyMap.get(nums[i]) > nums.length / 2) {
                majorNum = nums[i];
                break;
            }
        }

        return majorNum;
    }
}
