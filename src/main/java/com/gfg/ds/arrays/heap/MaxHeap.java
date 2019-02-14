package com.gfg.ds.arrays.heap;

public class MaxHeap extends AbstractHeap {

    public MaxHeap(int capacity) {
        super(capacity);
    }

    // for max heap
    protected void percolateDown(int i) {
        if (i < 0 || i >= this.count) {
            return;
        }
        int left = this.left(i), right = this.right(i), max;
        if (left != -1 && arr[left] > arr[i]) {
            max = left;
        } else {
            max = i;
        }

        if (right != -1 && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            this.percolateDown(max);
        }
    }

    // for max heap
    protected void percolateUp(int i) {
       if (i < 0 || i >= this.count) {
           return;
       }

       int parent = this.parent(i);
       if (parent != -1 && arr[i] > arr[parent]) {
           int temp = arr[i];
           arr[i] = arr[parent];
           arr[parent] = temp;
           this.percolateUp(parent);
       }
    }
}
