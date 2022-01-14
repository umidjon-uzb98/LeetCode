package com.company.easy;

public class E88_MergeSortedArray {
//    Input: nums1 = [1,2,2,3,5,6], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int index = nums1.length - 1;
        while(n >= 0){
            if(m >=0 && nums1[m] >= nums2[n]){
                nums1[index]=nums1[m--];
            }else nums1[index] = nums2[n--];
            index--;
        }

    }

/*    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0; i--) {
            if (n < 1) {
                break;
            }
            if (m -1 >= 0 && nums1[m - 1] >= nums2[n - 1]) {
                nums1[i] = nums1[--m];
            } else {
                nums1[i] = nums2[--n];
            }
        }
    }*/

/*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0; i<n; i++){
            nums1[m+i]=nums2[i];
        }

        Arrays.sort(nums1);
    }
 */


}
