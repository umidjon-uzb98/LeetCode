package com.company.easy;

public class E409_LongestPalindrome {
        public int longestPalindrome(String s) {
            int[] charCounts = new int[58]; // ASCII  Values from 'A' to 'z'
            int ret = 0;
            Boolean odd = false;
            for (int i = 0; i < s.length(); i++) { // Counts each character
                charCounts[s.charAt(i) - 65 ] += 1;
            }

            for (int count: charCounts) {
                if (count > 0) {
                    if (count % 2 == 0) { // If even count, add count of that character to return number.
                        ret += count;
                    } else {
                        ret += count - 1;
                        odd = true; // There will be at least one char to put in center by itself.
                    }
                }
            }
            if (odd) {
                return ret + 1;
            }
            return ret;
        }

}

