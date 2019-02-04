package com.gfg.ds.linkedlist;

// done
// https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
public class MergeLists {
    Node MergeLists(Node headA, Node headB) {
        if (headA == null && headB == null) {
            return null;
        } else if (headA == null) {
            return headB;
        } else if (headB == null) {
            return headA;
        }

        Node first = null; // first represents the smaller list (node's value).
        Node second = null; // second represents the bigger list (node's value).
        if (headA.data < headB.data) {
            first = headA;
            second = headB;
        } else {
            first = headB;
            second = headA;
        }
        Node head = first; // assigning first to the head.

        // moving first pointer until it is smaller than second.
        while (first != null && first.next != null && first.next.data < second.data) {
            first = first.next;
        }

        Node tempA = first.next;
        Node tempB = second.next;

        first.next = second; // stitching first to second.
        second.next = MergeLists(tempA, tempB);

        return head;
    }
}

// Test case 1
// headA -> 5 10 15 40
// headB -> 2 3 20
// output 2 3 5 10 15 20 40

// Test case 2
// headA -> 1 1
// headB -> 2 4
// output 1 1 2 4