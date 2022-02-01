package com.company.easy;

import java.util.HashMap;

public class E205_IsomorphicStrings {

//    Input: s = "egg", t = "add"
//    Output: true


    public boolean isIsomorphic(String s, String t) {
        char[] sToT = new char[128];
        char[] tToS = new char[128];

        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sToT[sChar] == 0 && tToS[tChar]==0){
                sToT[sChar]=tChar;
                tToS[tChar]=sChar;
            }else if(sToT[sChar] != tChar){
                return false;
            }
        }

        return true;
    }

       /* public boolean isIsomorphic(String s, String t) {
            HashMap< Character, Character> map=new HashMap<>();
            int n=s.length();
            for(int i=0;i<n;i++)
            {
                char key=s.charAt(i);
                char value=t.charAt(i);
                if(map.containsKey(key)){
                    if(value!=map.get(key))
                        return false;
                }
                else{
                    if(map.containsValue(value))
                        return false;
                    else
                        map.put(key,value);
                }
            }
            return true;
        }*/

}

