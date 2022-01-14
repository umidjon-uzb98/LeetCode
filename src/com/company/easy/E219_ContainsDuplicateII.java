package com.company.easy;

import java.util.HashSet;
import java.util.Set;

public class E219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true;

            if(set.size() > k) set.remove(nums[i-k]);
        }

        return false;
    }

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(nums[0], 0);
//        for(int i=1; i<nums.length; i++){
//            if(map.containsKey(nums[i])){
//                if(i - map.get(nums[i])<=k) return true;
//                map.put(nums[i], i);
//            }
//            map.put(nums[i], i);
//        }
//
//        return false;
//    }

}

