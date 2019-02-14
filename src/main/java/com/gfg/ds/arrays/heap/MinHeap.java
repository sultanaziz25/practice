package com.gfg.ds.arrays.heap;

public class MinHeap extends AbstractHeap {

    public MinHeap(int capacity) {
        super(capacity);
    }

    // for min heap
    protected void percolateDown(int i) {
        if (i < 0 || i >= this.count) {
            return;
        }
        int left = this.left(i), right = this.right(i), min;
        if (left != -1 && arr[left] < arr[i]) {
            min = left;
        } else {
            min = i;
        }

        if (right != -1 && arr[right] < arr[min]) {
            min = right;
        }

        if (min != i) {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            this.percolateDown(min);
        }
    }

    // for min heap
    protected void percolateUp(int i) {
       if (i < 0 || i >= this.count) {
           return;
       }

       int parent = this.parent(i);
       if (parent != -1 && arr[i] < arr[parent]) {
           int temp = arr[i];
           arr[i] = arr[parent];
           arr[parent] = temp;
           this.percolateUp(parent);
       }
    }
}
