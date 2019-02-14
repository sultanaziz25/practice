package com.gfg.ds.arrays.heap;

public abstract class AbstractHeap {

    protected int arr[] = null;
    protected int capacity;
    protected int count;

    protected AbstractHeap(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.arr = new int[this.capacity];
    }

    // 2*i + 1
    protected int left(int i) {
        int left = -1;
        if (i < 0 || i >= this.count || 2*i + 1 >= this.count) {
            return left;
        }
        left = 2*i + 1;
        return left;
    }

    // 2*i + 2
    protected int right(int i) {
        int right = -1;
        if (i < 0 || i >= this.count || 2*i + 2 >= this.count) {
            return right;
        }
        right = 2*i + 2;
        return right;
    }

    // (i-1)/2
    protected int parent(int i) {
        int parent = -1;
        if (i < 0 || i >= this.count) {
            return parent;
        }
        parent = (i -1)/2;
        return parent;
    }


    protected void insert(int num) {
        this.count = this.count + 1;
        if (this.capacity == this.count) {
            // increase the capacity.
            resizeHeap();
        }
        arr[this.count-1] = num;
        this.percolateUp(this.count-1);
    }

    protected int deleteTop() {
        if (this.count == 0) {
            return -1;
        }
        int op = arr[0];
        arr[0] = arr[--this.count];
        // this.count;
        this.percolateDown(0);
        return op;
    }

    protected int peekTop() {
        if (this.count == 0) {
            return -1;
        }
        int op = arr[0];
        return op;
    }

    public void buildHead(int[] arr) {
        while(arr.length > this.capacity) {
            resizeHeap();
        }
        for(int i=0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public void printHeap() {
        for (int i =0; i< this.count; i++){
            System.out.print(arr[i] + (i == this.count - 1 ? "" : ", "));
        }
        System.out.println();
    }


    protected void resizeHeap() {
        int[] arrNew = new int[this.capacity*2];
        System.arraycopy(this.arr, 0, arrNew, 0,this.arr.length);
        this.arr = arrNew;
        this.capacity = this.capacity*2;
    }

    protected abstract void percolateDown(int i);
    protected abstract void percolateUp(int i);
}
