package com.company.easy;

public class E67_AddBinary {
//    Input: a = "11", b = "1"
//    Output: "100"

/*
   public String addBinary(String a, String b) {

        StringBuilder sb =new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;

            if (i>=0) sum+= a.charAt(i)-'0';
            if (j>=0) sum+= b.charAt(j)-'0';
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }

        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
*/

/*
   public String addBinary(String a, String b) {
        String temp = "";
        if(a.length() < b.length()){
            temp = b;
            b = a;
            a = temp;
        }

        int dif =a.length() - b.length();
        String newb = "";
        if( dif > 0){
            for(int i=0; i<dif; i++){
                newb+="0";
            }
        }
        b = newb+b;

        String res ="";
        boolean memory = false;
        for(int i=a.length()-1; i>=0; i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(!memory){
                    res = "0" + res;
                    memory = true;
                }else{
                    res = "1" + res;
                    memory = true;
                }
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                if(!memory){
                    res = "0" + res;
                }else{
                    res = "1" + res;
                    memory = false;
                }
            }else{
                if(!memory){
                    res = "1" + res;
                }else{
                    res = "0" + res;
                    memory = true;
                }
            }
        }

        if(memory){
            res="1"+res;
        }
        return res;
    }
*/

}
