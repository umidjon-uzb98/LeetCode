package com.company.easy;

import java.util.Arrays;

public class E349_IntersectionofTwoArrays {
//    Example 1:
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2]
//
//    Example 2:
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//    Explanation: [4,9] is also accepted.

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] > 0) {
                result[index++] = nums2[i];
                count[nums2[i]] = 0;
            }
        }
        return Arrays.copyOf(result, index);
    }

    /*

    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1) {
            set1.add(i);
        }
        for(int i : nums2) {
            if(set1.contains(i)) {
                set2.add(i);
            }
        }
        int intersection[] = new int[set2.size()];
        int j = 0;
        for(int i : set2) {
            intersection[j++] = i;
        }
        return intersection;
    }

   */
}

