package com.aliens.demoapp.arraysandhash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums)
    {
       Set<Integer> set = new HashSet<>();
       for(int number :nums)
       {
           if(set.contains(number))
              {
                return true;
              }
           set.add(number);
       }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Contains duplicate = " + ContainsDuplicate.containsDuplicate(new int[]{2, 2,2, 3, 1}));
    }
}
