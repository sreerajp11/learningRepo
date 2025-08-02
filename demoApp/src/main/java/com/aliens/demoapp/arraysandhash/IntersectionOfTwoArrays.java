package com.aliens.demoapp.arraysandhash;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int number : nums1) {
            set1.add(number);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int number : nums2) {
            set2.add(number);
        }

        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }

}
