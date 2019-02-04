package com.gfg.ds.linkedlist;

// Intersection Point in Y Shapped Linked Lists
// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
public class IntersectionPoint {
    int intersectPoint(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return -1;
        }

        int lenA = getLength(headA), lenB = getLength(headB);
        Node first = null, second = null;
        if (lenA > lenB) {
            first = headA;
            second = headB;
        } else {
            first = headB;
            second = headA;
        }
        int diff = Math.abs(lenA - lenB), count = 0;
        while (first != null && count < diff) {
            first = first.next;
            count++;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first.data;
    }

    int getLength(Node head) {
        int length = 0;
        if (head == null) {
            return length;
        }

        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}

