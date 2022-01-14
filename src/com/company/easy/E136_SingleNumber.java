package com.company.easy;

public class E136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int ele : nums) result = result ^ ele;
        return result;
    }
}
//   XOR operator
// 1 ^ 1 = 0;
// 1 ^ 0 = 1;
// 0 ^ 1 = 1;
// 0 ^ 0 = 0;

// 2 lik sanoq tizimiga otkazib ^ operator bn tekshiradi
