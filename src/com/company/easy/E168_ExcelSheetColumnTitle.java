package com.company.easy;

public class E168_ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {

        StringBuilder sb =new StringBuilder();
        while(columnNumber != 0){
            columnNumber--;
            sb.append((char)('A'+columnNumber%26));
            columnNumber/=26;
        }
        sb.reverse();
        return sb.toString();
    }
}

