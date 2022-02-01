package com.company.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E100_SameTree {
//    Input: p = [1,2,3], q = [1,2,3]
//    Output: true

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }else if(p.val != q.val )
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
