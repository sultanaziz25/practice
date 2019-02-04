package com.gfg.ds.linkedlist;

// https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
public class PairwiseSwap {
    public static void pairwiseSwap(Node node) {
        Node temp = node;
        while(temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
}
