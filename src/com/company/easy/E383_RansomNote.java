package com.company.easy;

public class E383_RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ch = new int[128];
        for(int i=0; i<magazine.length(); i++){
            ch[magazine.charAt(i)]++;
        }

        for(int i=0; i<ransomNote.length(); i++){
            ch[ransomNote.charAt(i)]--;
        }

        for(int x : ch){
            if(x<0)return false;
        }
        return true;
    }

}

