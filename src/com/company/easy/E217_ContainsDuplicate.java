package com.company.easy;

import java.util.HashSet;
import java.util.Set;

public class E217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (int i : nums) {
            if (!hs.add(i)) {
                return true;
            }
        }
        return false;
    }

/*    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;
    }*/
}

