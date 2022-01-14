package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E268_MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += i;
            sum -= nums[i];
        }
        sum+=nums.length;

        return sum;
    }


   /* public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i!=nums[i]){
                return i;
            }
        }

        return nums.length;
    }*/
}

