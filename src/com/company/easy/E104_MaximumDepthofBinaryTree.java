package com.company.easy;

public class E104_MaximumDepthofBinaryTree {
//    Input: root = [3,9,20,null,null,15,7]
//     Output: 3

    int maxd = 0;
    public void visit(TreeNode n, int depth) {
        if (n == null)
            return;

        maxd = Math.max(maxd, depth + 1);
        visit(n.left, depth + 1);
        visit(n.right, depth + 1);
    }

    public int maxDepth(TreeNode root) {
        visit(root, 0);
        return maxd;
    }
}
