package com.gfg.ds.linkedlist;

// Done
// Check on https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
public class MiddleElement {
    // Function to find middle element a linked list
    int getMiddle(Node head) {
        // Your code here.
        if (head == null) {
            return -1;
        }

        Node fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }
}
