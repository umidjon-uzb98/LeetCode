package com.company.medium;

import java.util.HashMap;

public class M5_LongestPalindromicSubstring {
//    Example 1:
//
//    Input: s = "babad"
//    Output: "bab"
//    Explanation: "aba" is also a valid answer.


// --------------------------------------------------------------------------------------------------
/*
  public String longestPalindrome(String s) {
          int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = expand(s, i, i);
            int even = expand(s, i, i + 1);

            int len = Math.max(odd, even);
            if (len > end - start + 1) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int expand(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
*/

/*
    // MY SOLUTION
//------------------------------------------------------------------------------------
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String longest = "";

        for(int i=0; i<s.length(); i++){
            int k = s.length()-1;
            while(k >= i && k-i + 1 > longest.length() ){

                if(s.charAt(k) == s.charAt(i)){
                    sb.append(s.substring(i,k+1));
                    String sbu = sb.reverse().toString();
                    if(sbu.equals(s.substring(i,k+1))){
                        if(longest.length() < sbu.length() ){
                            longest = sbu;
                        }
                    }
                    sb.delete(0,sb.length());
                }
                k--;
            }
        }

        return longest;
    }
*/


}
