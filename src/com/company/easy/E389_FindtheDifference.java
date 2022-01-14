package com.company.easy;

import java.util.Arrays;

public class E389_FindtheDifference {

    public char findTheDifference(String s, String t) {
        int[] record = new int[26];
        for(char letter : s.toCharArray()) {
            record[letter - 'a']++;
        }
        for(char letter : t.toCharArray()) {
            record[letter - 'a']--;
        }
        int k =0;
        for(int i=0; i<record.length; i++) {
            if(record[i] != 0){
                k =i;
            }
        }
        return (char)('a' + k);
    }

}

