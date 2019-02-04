package com.gfg.ds.linkedlist;

// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
public class NthNodeFromLast {

    int getNthFromLast(Node head, int n) {
        if (head == null || n < 0) {
            return -1;
        }

        Node first = head;
        Node second = head;

        int count = 0;
        while (first != null && count < n) {
            first = first.next;
            count++;
        }

        // corner case when n is greater than the size of linked list.
        if (count != n) {
            return -1;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
}
