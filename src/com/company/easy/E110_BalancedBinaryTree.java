package com.company.easy;

public class E110_BalancedBinaryTree {
//  Input: root = [3,9,20,null,null,15,7]
//  Output: true

    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        postorder(root);
        return ans;
    }

    int postorder(TreeNode root) {
        if(root == null) return 0;
        int lh = postorder(root.left);
        int rh = postorder(root.right);
        if(Math.abs(lh - rh) >1)    ans = false;
        int h = Math.max(lh, rh) +1;
        return h;
    }
}
