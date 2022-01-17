package com.company.easy;

import java.util.HashMap;

public class E290_WordPattern {
//    Example 1:
//    Input: pattern = "abba", s = "dog cat cat dog"
//    Output: true

//    Example 2:
//    Input: pattern = "abba", s = "dog cat cat fish"
//    Output: false

    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] split = s.split(" ");

        if(p.length() != split.length) return false;

        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            if(map.containsKey(ch)){
                if( !map.get(ch).equals(split[i]))  return false;
            }else if(map.containsValue(split[i]) ){
                return false;
            }else {map.put(ch,split[i]);}
        }
        return true;

    }

}

