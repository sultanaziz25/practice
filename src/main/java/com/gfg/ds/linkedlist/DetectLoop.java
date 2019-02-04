package com.gfg.ds.linkedlist;

// GFG is giving timeout on submission but solution is correct.
// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
public class DetectLoop {

    int detectLoop(Node head) {
        int hasLoop = 0;
        if (head == null) {
            return hasLoop;
        }
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                hasLoop = 1;
                break;
            }
        }

        return hasLoop;
    }
}
