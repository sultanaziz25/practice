package com.geek;

import java.util.Stack;

/**
 * Created by hug08153 on 17-Dec-17.
 * Find Next Greater Element in an Array.
 */
public class NGE {

    public static void main(String[] args) {
        //int[] A = new int[]{4, 5 , 2, 25};
        int[] A = new int[]{13, 3 , 24, 55};

        printNGE(A);
        Integer a = Integer.MIN_VALUE;
        if (0 > a) {

        }
    }

    private static void printNGE(int A[]) {
        if (A == null || A.length < 1) {
            return;
        }
        Stack s = new Stack();
        s.push(A[0]);

        for (int i = 1; i < A.length; i++) {
            int next = A[i];
            int element = (Integer) s.peek();

            /*while (next > element) {
                System.out.println("For element " + element + " NGE is " + next);
                s.pop();
                s.push(next);
                element = next;
            }*/
            if (next > element) {
                System.out.println("For element " + element + " NGE is " + next);
                s.pop();
                s.push(next);
            } else {

            }
        }
    }
}
