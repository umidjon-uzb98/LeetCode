package com.company.easy;


public class    E14_LongestCommonPrefix {
/*
public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];

        for(int i=0; i<strs.length; i++){
            if(strs[i].indexOf(prefix)!=0){
                if(prefix.length()==1) return "";
                prefix = prefix.substring(0,prefix.length()-1);
                i--;
            }
        }
        return prefix;
}

*/
    /*
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
        return "";
    int minLen = Integer.MAX_VALUE;
    for (String str : strs)
        minLen = Math.min(minLen, str.length());
    int low = 1;
    int high = minLen;
    while (low <= high) {
        int middle = (low + high) / 2;
        if (isCommonPrefix(strs, middle))
            low = middle + 1;
        else
            high = middle - 1;
    }
    return strs[0].substring(0, (low + high) / 2);
}

private boolean isCommonPrefix(String[] strs, int len){
    String str1 = strs[0].substring(0,len);
    for (int i = 1; i < strs.length; i++)
        if (!strs[i].startsWith(str1))
            return false;
    return true;
}
*/

//------------------------------------------------------------------------------------

    //MY SOLUTION
/*
   public String longestCommonPrefix(String[] strs) {

        int s = 1;
        String res = "";
        String temp ="";

        if(strs.length==1){
            return strs[0];
        }
        if(strs[0].length()==0){
            return "";
        }
        for(int i=0; i<strs.length; i++){
             temp =strs[0].substring(0,s);
            if(strs[i].length() >=s &&  temp.equals(strs[i].substring(0,s))){
                    if(strs.length-1 == i){
                    res=temp;
                     if(s+1<=strs[0].length()){
                        s++;
                        i=0;
                    }else{
                        return res;
                    }
                }
                }else{
                    return res;
                }
        }

        return "";

    }
*/

}
