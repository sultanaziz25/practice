package com.gfg.ds.linkedlist;

// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
public class ReverseInGroups {
    public static Node reverse(Node node, int k) {
        Node curr = node, prev = null, next = null;
        int count = 0;
        while(curr != null && count < k)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null)
            node.next = reverse(next, k);
        return prev;
    }
}

// For k = 4
// 1 2 2 4 5 6 7 8
// 4 2 2 1 8 7 6 5