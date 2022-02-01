package com.company.easy;

public class E108_ConvertSortedArraytoBinarySearchTree {
//    Input: nums = [-10,-3,0,5,9]
//    Output: [0,-3,9,-10,null,5]
//    Explanation: [0,-10,5,null,-3,null,9] is also accepted:

    int[] nums;
    public TreeNode make(int l, int h) {
        if (h <= l)
            return null;

        var m = (h + l) / 2;

        var n = new TreeNode();
        n.val = nums[m];
        n.left = make(l, m);
        n.right= make(m + 1, h);
        return n;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return make(0, nums.length);
    }
}
