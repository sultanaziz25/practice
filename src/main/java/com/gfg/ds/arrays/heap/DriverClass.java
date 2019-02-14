package com.gfg.ds.arrays.heap;

public class DriverClass {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 9, 21, 2, 3, 7, 10, 64, 6, 91};
        //int[] arr = new int[]{4, 9, 21, 2};
        MaxHeap maxHeap = new MaxHeap(5);
        testHeap(maxHeap, arr);
        MinHeap minHeap = new MinHeap(5);
        testHeap(minHeap, arr);
    }

    static void testHeap(AbstractHeap heap, int[] arr) {
        heap.buildHead(arr);
        heap.insert(75);
        heap.insert(145);
        heap.printHeap();
        int top = heap.deleteTop();
        do {
            System.out.print(top + ", ");
            top = heap.deleteTop();
        } while (top != -1);

        System.out.println();
    }
}
