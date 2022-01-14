package com.company.easy;

public class E171_ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i=0; i<columnTitle.length(); i++){
            num = num * 26;
            int ascii = columnTitle.charAt(i) - 'A'+1;
            num = num + ascii;
        }

        return num;
    }

    //MY SOLUTION
/*    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i=0; i<columnTitle.length(); i++){
            num = num * 26;
            int ascii = columnTitle.charAt(i) - 64;
            num = num + ascii;
        }

        return num;
    }*/
}

