package com.gfg.ds.linkedlist;

// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
// See 1.52 sec video at https://www.youtube.com/watch?v=tWtq2nd7sI4
public class RotateLinkedList {
    public void rotate(Node head,int k) {
        if (head == null || k < 1) {
            return;
        }
        // Traverse till kth node of the list.
        Node kth = head;
        int i = 1;
        while (kth != null) {
            if (i == k) {
                break;
            }
            kth = kth.next;
            i++;
        }

        if (kth.next != null) { // This check is required when k is equal to the length of the provided linked list.
            Node last = kth.next;
            // Traverse till the end of the linked list.
            while (last.next != null) {
                last = last.next;
            }

            last.next = head;
            head = kth.next;
            kth.next = null; // Marking kth node's next pointer as Null.
        }

        // Printing the rotated linked list.
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

// For k = 4
// Input HEAD->1->2->3->4->5->6->7->8->NULL
// output HEAD->5->6->7->8->1->2->3->4->NULL
