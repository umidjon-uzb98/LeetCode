package com.company.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class M3_LongestSubstringWithoutRepeatingCharacters {
/*    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.*/

  /*  public int lengthOfLongestSubstring(String s) {
        int[] lastPos = new int[256];
        int max = 0;
        int pos = 0;
        Arrays.fill(lastPos, -1);
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int right = 0, left = 0; right < s.length(); right++) {
            pos = s.charAt(right);
            if (lastPos[pos] >= left) {
                left = lastPos[pos]+1;
            }
            lastPos[pos] = right;
            max = Math.max(max, right - left + 1);
        }
        return max;
    }*/

    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int right = 0, left = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            max = Math.max(max, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }
        return max;
    }
    /*
    *  public int lengthOfLongestSubstring(String s) {
        Integer[] chars = new Integer[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }

            res = Math.max(res, right - left + 1);

            chars[r] = right;
            right++;
        }

        return res;
    }*/

/*    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }*/

    // MY SOLUTION
//------------------------------------------------------------------------------------
//        public int lengthOfLongestSubstring(String s) {
//            int max = 0;
//            int pointer =0;
//            for(int i=pointer; i<s.length(); i++){
//
//                if(!s.substring(pointer, i).contains(s.substring(i,i+1))){
//                    max = Math.max(max,s.substring(pointer,i+1).length());
//                }else{
//
//                    pointer++;
//                    i=pointer;
//                }
//            }
//
//            return max;
//        }


}
