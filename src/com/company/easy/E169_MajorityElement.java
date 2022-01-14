package com.company.easy;

public class E169_MajorityElement {
    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.

    Example 1:
    Input: nums = [3,2,3]
    Output: 3

    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2*/


    public int majorityElement(int[] nums) {
        int vote = 0;
        int candidate = 0;

        for(int x : nums){
            if(vote==0) candidate=x;
            if(candidate==x) vote++;
            else vote--;
        }

        return candidate;
    }

//    public int majorityElement(int[] nums) {
//        int k = 1;
//        int con = nums[0];
//
//        for(int i=1; i<nums.length; i++){
//            if(k==0) con=nums[i];
//            if(con==nums[i]) k++;
//            else k--;
//        }
//
//        return con;
//    }
}

