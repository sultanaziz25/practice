package com.gfg.ds.arrays.rotation;

// All test cases passed
// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class RotateLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        if (d < 0 || a.length == 0) {
            return a;
        }

        d = d % a.length; // actual no of rotations.
        for (int i = 0; i < d; i++) {
            // one rotation at a time.
            int first = a[0];
            for (int j = 1; j < a.length; j++) {
                a[j-1] = a[j];
            }
            a[a.length - 1] = first;
        }

        return a;
    }
}
