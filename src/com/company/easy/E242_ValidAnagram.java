package com.company.easy;

import java.util.Arrays;

public class E242_ValidAnagram {
//    Example 1:
//    Input: s = "anagram", t = "nagaram"
//    Output: true

//    Example 2:
//    Input: s = "rat", t = "car"
//    Output: false


    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for(char letter : s.toCharArray()) {
            record[letter - 'a']++;
        }
        for(char letter : t.toCharArray()) {
            record[letter - 'a']--;
        }
        for(int i : record) {
            if(i != 0) return false;
        }
        return true;
    }
}

