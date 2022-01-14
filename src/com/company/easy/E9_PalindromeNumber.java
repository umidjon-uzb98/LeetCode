package com.company.easy;

import java.util.HashMap;
import java.util.Map;

public class E9_PalindromeNumber {

 /*   public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }*/

//------------------------------------------------------------------------------------


    //MY SOLUTION
/*    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int right = str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(right)){
                return false;
            }
            right--;
        }

        return true;
    }*/

}
