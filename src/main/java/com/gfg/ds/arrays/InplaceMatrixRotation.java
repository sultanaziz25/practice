package com.gfg.ds.arrays;

/**
 *
 * https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 *
 *  Inplace rotate square matrix by 90 degrees | Set 1
 *  Given an square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
 *  */
public class InplaceMatrixRotation {

    public static void main(String[] args) {
        int[][] _2dMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        inplaceRotate90DegreeAntiClockwise(_2dMatrix);
        printMatrix(_2dMatrix);
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
     * {3,6,9}
     * {2,5,8}
     * {1,4,7}
     * }
     * */
    static void inplaceRotate90DegreeAntiClockwise(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            int[] cols = matrix[i];
             reverseArray(cols);
        }
        transposeInplace(matrix);
    }

    static void transposeInplace(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length ; j++) {
                /*if (i==j) {
                    continue;
                }*/
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            int[] cols = matrix[i];
            for (int j =0 ; j < cols.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
