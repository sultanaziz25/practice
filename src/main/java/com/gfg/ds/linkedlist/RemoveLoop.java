package com.gfg.ds.linkedlist;

// GFG is giving timeout on submission but solution is correct.
// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
public class RemoveLoop {
    int removeTheLoop(Node node) {
        int isRemoved = 0;
        if (node == null) {
            return isRemoved;
        }
        boolean hasLoop = false;
        Node fast = node, slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasLoop = true;
                break;
            }
        }

        if (hasLoop) {
            Node prev = null;
            slow = node;
            while (fast != slow) {
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }
            prev.next = null;
            isRemoved = 1;
        }
        return isRemoved;
    }
}
