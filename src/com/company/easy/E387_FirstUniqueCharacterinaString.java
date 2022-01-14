package com.company.easy;

public class E387_FirstUniqueCharacterinaString {
//    Example 1:
//    Input: s = "leetcode"
//    Output: 0
//
//    Example 2:
//    Input: s = "loveleetcode"
//    Output: 2
//
//    Example 3:
//    Input: s = "aabb"
//    Output: -1

    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            freq[chars[i] - 'a'] = freq[chars[i] - 'a'] + 1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

