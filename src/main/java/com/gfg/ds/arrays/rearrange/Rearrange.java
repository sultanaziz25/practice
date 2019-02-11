package com.gfg.ds.arrays.rearrange;

// https://www.geeksforgeeks.org/rearrange-array-arri/
public class Rearrange {

    static int[] tc1 = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
    static int[] tc2 = new int[]{19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
            11, 10, 9, 5, 13, 16, 2, 14, 17, 4};

    public static void main(String[] args) {
        int[] a = tc2;
        print(a);
        rearrange(a);
        print(a);
    }

    private static void rearrange(int[] a) {
        for (int i=0; i < a.length;) {
            if (a[i] != -1 && a[i] != i) {
                int temp = a[a[i]];
                a[a[i]] = a[i];
                a[i] = temp;
            } else {
                i++;
            }
        }
    }

    static void print(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
