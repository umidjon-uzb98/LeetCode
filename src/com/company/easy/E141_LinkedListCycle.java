package com.company.easy;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }

public class E141_LinkedListCycle {
//    Input: head = [3,2,0,-4], pos = 1
//    Output: true
//    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
