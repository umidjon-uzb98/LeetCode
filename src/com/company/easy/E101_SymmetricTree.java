package com.company.easy;

public class E101_SymmetricTree {
//    Input: root = [1,2,2,null,3,null,3]
//    Output: false

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode a, TreeNode b) {
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val != b.val) return false;

        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);

    }
}
