package com.company.easy;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class E94_BinaryTreeInorderTraversal {
//    Input: root = [1,null,2,3]
//    Output: [1,3,2]


    List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root){
        //base case;
        if(root==null) return;

        //traverse the left side
        dfs(root.left);

        //take the current node val
        res.add(root.val);

        //traverse the right side
        dfs(root.right);

    }

/*

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curRoot = root;

        while(true){
            while(curRoot!= null){
                stack.add(curRoot);
                curRoot = curRoot.left;
            }
            if(stack.isEmpty()) break;
            curRoot = stack.pop();
            res.add(curRoot.val);
            curRoot =curRoot.right;
        }

        return res;
    }
*/

}
