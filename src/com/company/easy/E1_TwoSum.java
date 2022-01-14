package com.company.easy;

import java.util.HashMap;
import java.util.Map;

public class E1_TwoSum {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int target = 7;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
//        return null;

//------------------------------------------------------------------------------------

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        // In case there is no solution, we'll just return null
//        return null;

//------------------------------------------------------------------------------------

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        // In case there is no solution, we'll just return null
//        return null;
    }



}
