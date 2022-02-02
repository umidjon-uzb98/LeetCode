package com.company.easy;

import java.util.HashSet;
import java.util.Stack;

public class E160_IntersectionofTwoLinkedLists {
//  Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//  Output: Intersected at '8'
//  Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//  From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
//  There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a=headA;
        ListNode b=headB;

        while(a!=b){
            a= a==null ? headB : a.next;
            b= b==null ? headA : b.next;

            /*if(a == null) a = headB;
            else a = a.next;

            if(b == null) b = headA;
            else b = b.next;*/
        }

        return a;
    }
}

