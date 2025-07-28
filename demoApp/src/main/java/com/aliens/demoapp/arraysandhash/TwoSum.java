package com.aliens.demoapp.arraysandhash;

import java.util.HashMap;

/**
 * Return indices of two nums such that they add up
 * to the target
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSum.twoSum(new int[]{1, 7, 5, 2}, 4);
    }
}
