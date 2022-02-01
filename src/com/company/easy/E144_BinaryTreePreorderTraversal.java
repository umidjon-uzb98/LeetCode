package com.company.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E144_BinaryTreePreorderTraversal {
//  Input: root = [1,null,2,3]
//  Output: [1,2,3]

    public List preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            if(temp != null){
                list.add(temp.val);
                st.push(temp.right);
                st.push(temp.left);
            }
        }
        return list;
    }

  /*  List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        recursion(root);
        return res;
    }

    public void recursion(TreeNode root){
        if(root == null) return;
        res.add(root.val);

        recursion(root.left);
        recursion(root.right);
    }*/
}

