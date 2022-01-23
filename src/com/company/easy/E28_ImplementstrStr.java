package com.company.easy;

public class E28_ImplementstrStr {
//    Example 1:
//    Input: haystack = "hello", needle = "ll"
//    Output: 2

 /*   public int strStr (String haystack, String needle){
        if (needle.length() > haystack.length() ) {
            return -1;
        }
        if (needle.length()==0) {
            return 0;
        }
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }*/
// FAST    *********************************************************************************************

    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int next[] = getNext(needle);
        int j = -1;
        for(int i = 0; i < haystack.length(); i++) {
            while(j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) j = next[j];
            if(haystack.charAt(i) == needle.charAt(j + 1)) j++;
            if(j == needle.length() - 1) return (i - needle.length() + 1);
        }
        return -1;
    }

    public int[] getNext(String needle) {
        int next[] = new int[needle.length()];
        int j = -1;
        next[0] = j;
        for(int i = 1; i < needle.length(); i++) {
            while(j >=0 && needle.charAt(i) != needle.charAt(j + 1)) j = next[j];
            if(needle.charAt(i) == needle.charAt(j + 1)) j++;
            next[i] = j;
        }
        return next;
    }

//    *********************************************************************************************

    /*
    public int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        }
        if(needle.equals(haystack)) {
            return 0;
        }
        for(int i = 0; i < haystack.length(); i++) {
            if(i + needle.length() > haystack.length()) {
                return -1;
            }
            if((haystack.substring(i, i + needle.length())).equals(needle)) {
                return i;
            }
        }
        return -1;
    }*/

/*
  public int strStr(String h, String n) {
        if(h.length()<n.length()){
            return -1;
        }
        if(n.length()==0){
            return 0;
        }

        int hh = h.length();
        int nn = n.length();

        for(int i=0; i <= hh-nn; i++ ){
            if(h.charAt(i) == n.charAt(0) ){
                String str = h.substring(i, i+nn);

                if(str.equals(n) ){
                    return i;
                }
            }
        }

        return  -1;
    }
*/

/*
    public int strStr(String haystack, String needle) {
        return  haystack.indexOf(needle);
    }*/
}
