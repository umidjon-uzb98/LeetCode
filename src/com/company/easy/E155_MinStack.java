package com.company.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E155_MinStack {
//  Input
//  ["MinStack","push","push","push","getMin","pop","top","getMin"]
//  [[],[-2],[0],[-3],[],[],[],[]]
//
//  Output
//  [null,null,null,null,-3,null,0,-2]
//
//  Explanation
//  MinStack minStack = new MinStack();
//  minStack.push(-2);
//  minStack.push(0);
//  minStack.push(-3);
//  minStack.getMin(); // return -3
//  minStack.pop();
//  minStack.top();    // return 0
//  minStack.getMin(); // return -2

    private int min;
    private int top;

    Stack<Integer> stack;
    Stack<Integer> min_vals;

//    public MinStack() {
//        this.min_vals = new Stack<>();
//        this.stack = new Stack<>();
//    }

    public void push(int val) {
        if(min_vals.isEmpty() || val <= min_vals.peek()){
            min_vals.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if( stack.peek().equals(min_vals.peek()) ){
            min_vals.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_vals.peek();
    }
}

