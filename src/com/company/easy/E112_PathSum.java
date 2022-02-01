package com.company.easy;

public class E112_PathSum {
//  Input: root = [3,9,20,null,null,15,7]
//  Output: 2

    private int targetSum = 0;
    private boolean found = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        preOrder(root,0);
        return found;
    }

    public void preOrder(TreeNode root, int currentSum) {
        if(root == null || found)
            return;
        int s = currentSum + root.val;
        if(s == targetSum && root.left == null && root.right == null) {
            found = true;
        }
        preOrder(root.left,s);
        preOrder(root.right,s);
    }
}
