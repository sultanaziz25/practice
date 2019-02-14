package com.gfg.ds.arrays.rotation;

/**
 *
 * https://www.geeksforgeeks.org/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/
 *
 * */
public class InplaceMatrixRotationClockwise {

    public static void main(String[] args) {
        int[][] _2dMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        inplaceRotate90DegreeClockwise(_2dMatrix);
        InplaceMatrixRotation.printMatrix(_2dMatrix);
    }

    /**
     * {
     * {1,2,3}
     * {4,5,6}
     * {7,8,9}
     * }
     *
     *  ||
     * \||/
     *  \/
     *
     * {
     * {7,4,1}
     * {8,5,2}
     * {9,6,3}
     * }
     * */
    static void inplaceRotate90DegreeClockwise(int[][] matrix) {
        InplaceMatrixRotation.transposeInplace(matrix);
        // col reverse
        for(int i=0; i<matrix.length; i++) {
            int[] cols = matrix[i];
            InplaceMatrixRotation.reverseArray(cols);
        }
    }

}
