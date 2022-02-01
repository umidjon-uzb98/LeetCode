package com.company.easy;

public class E111_MinimumDepthofBinaryTree {
//  Input: root = [3,9,20,null,null,15,7]
//  Output: 2

    int minHt = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        minDepth(root, 1);

        return minHt;
    }

    private void minDepth(TreeNode root, int ht){
        if(root == null) return;
        if(minHt < ht){
            return;
        }
        if(root.left == null && root.right == null && minHt > ht){
            minHt = ht;
        }

        minDepth(root.left, ht + 1);
        minDepth(root.right, ht + 1);
    }
}
