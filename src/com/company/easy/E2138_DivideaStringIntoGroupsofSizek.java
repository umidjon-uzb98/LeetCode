package com.company.easy;

public class E2138_DivideaStringIntoGroupsofSizek {
/*
    Input: s = "abcdefghij", k = 3, fill = "x"
    Output: ["abc","def","ghi","jxx"]
*/


    public String[] divideString(String str, int k, char fill) {
        int index = 0;
        int stringLength = str.length();
        StringBuilder sb = new StringBuilder(str);

        // find size of array creation
        String[] strArr = (stringLength % k == 0) ? new String[stringLength / k] : new String[(stringLength / k) + 1];

        //append fill after str
        if (stringLength % k != 0) {
            for (int i = 0; i < k - (stringLength % k); i++) {
                sb.append(fill);
            }
        }

        //divide into k
        for (int i = 0; i < sb.length(); i += k) {
            strArr[index] = (sb.substring(i, i + k));
            index++;
        }

        return strArr;
    }

}

