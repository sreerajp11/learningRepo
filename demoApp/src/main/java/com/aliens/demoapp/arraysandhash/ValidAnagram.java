package com.aliens.demoapp.arraysandhash;

import java.util.HashMap;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(ValidAnagram.isAnagram("anagram", "nagaram"));
    }
}
