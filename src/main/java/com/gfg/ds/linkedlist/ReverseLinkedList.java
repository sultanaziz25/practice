package com.gfg.ds.linkedlist;

// Done
// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
public class ReverseLinkedList {
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverse(Node head) {
        if (head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}

//  HEAD -> 1->2-> NULL