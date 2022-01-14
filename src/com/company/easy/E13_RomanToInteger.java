package com.company.easy;

public class E13_RomanToInteger {

    /*
     public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res =0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'V' ||  s.charAt(i) == 'X' ){
                if(i>0 && s.charAt(i-1)=='I') res -= 2;
            }
            if(s.charAt(i) == 'L' ||  s.charAt(i) == 'C' ){
                if(i>0 && s.charAt(i-1)=='X') res -= 20;
            }
            if(s.charAt(i) == 'D' ||  s.charAt(i) == 'M' ){
                if(i>0 && s.charAt(i-1)=='C') res -= 200;
            }
            res+=map.get(s.charAt(i));
        }

        return res;
    }
*/


/*
    public int romanToInt(String s) {
        Map<Character,Integer> rimNo = new HashMap<>();
        rimNo.put('I',1);
        rimNo.put('V',5);
        rimNo.put('X',10);
        rimNo.put('L',50);
        rimNo.put('C',100);
        rimNo.put('D',500);
        rimNo.put('M',1000);

        int res =0;
MMIV
        for (int i = 0; i < s.length(); i++) {
            if(i>0 && rimNo.get(s.charAt(i)) >  rimNo.get(s.charAt(i-1)) ){
                res+=rimNo.get(s.charAt(i)) - 2 * rimNo.get(s.charAt(i-1));
            }else{
                res+=rimNo.get(s.charAt(i));
            }
        }

        return res;
    }
*/

//------------------------------------------------------------------------------------

    //MY SOLUTION
/*
    public int romanToInt(String s) {
        Map<String,Integer> rimNo = new HashMap<>();
        rimNo.put("I",1);
        rimNo.put("V",5);
        rimNo.put("X",10);
        rimNo.put("XL",40);
        rimNo.put("L",50);
        rimNo.put("XC",90);
        rimNo.put("C",100);
        rimNo.put("D",500);
        rimNo.put("M",1000);
        rimNo.put("IV",4);
        rimNo.put("IX",9);
        rimNo.put("CD",400);
        rimNo.put("CM",900);

        int sum =0;

        for (int i = 0; i < s.length(); i++) {
            if(i<s.length()-1  && rimNo.containsKey(s.substring(i,i+2)) ){
                sum+=rimNo.get(s.substring(i,i+2));
                i++;
            }else{
                sum+=rimNo.get(s.substring(i,i+1));
            }
        }

        return sum;
    }
*/

}
