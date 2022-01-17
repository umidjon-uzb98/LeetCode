package com.company.easy;

import java.util.Arrays;

public class E350_IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] > 0) {
                result[index++] = nums2[i];
                count[nums2[i]]--;
            }
        }
        return Arrays.copyOf(result, index);
    }

    /*public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0,j = 0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]==nums2[j]) {
                a.add(nums1[i]);
                i++;j++;
            }else if(nums1[i]<nums2[j]) {
                i++;
            }else if(nums1[i]>nums2[j]) {
                j++;
            }
        }
        int[] result = new int[a.size()];
        for(int k = 0;k<a.size();k++){
            result[k] = a.get(k);
        }
        return result;
    }*/
}

