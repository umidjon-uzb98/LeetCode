package com.company.easy;

public class E191_Numberof1Bits {
//      Input: n = 00000000000000000000000000001011
//      Output: 3
//      Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

    public int hammingWeight(int n) {
        int res = 0;

        while(n != 0){
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}

