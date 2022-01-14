package com.company.easy;

public class E125_ValidPalindrome {

    public boolean isPalindrome(String s) {

        char[] ch = s.toCharArray();
        for(int i=0, j = ch.length - 1;  i<j; ) {
            //if character is letter or digit increment i and decrement j
            if(!Character.isLetterOrDigit(ch[i])) i++;
            else if(!Character.isLetterOrDigit(ch[j])) j--;
                //check they are equal or not
            else if(Character.toLowerCase(ch[i++]) != Character.toLowerCase(ch[j--])) {
                return false;
            }
        }
        return true;
    }

   /* public boolean isPalindrome(String s) {
        s = s.toUpperCase();

        String f = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                f += c;
            }
        }

        int last = f.length()-1;
        for(int i=0; i<f.length()/2; i++){

            if(f.charAt(i) != f.charAt(last)) return false;

            last--;

        }

        return true;
    }*/
}
