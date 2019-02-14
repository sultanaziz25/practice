package com.gfg.ds.arrays.misc;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

// Find the contiguous sub-array with maximum sum.
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for(int j=0; j < n; j++) {
                String str = scanner.next();
                int a = Integer.parseInt(str);
                arr[j] = a;
            }
            int op = contiguousSubarrayWithMaximumSum(arr);
            System.out.println(op);

        }
    }

    static int contiguousSubarrayWithMaximumSum(Integer[] arr) {
        return 0;
    }

    public int maxSubArray(final List<Integer> A) {
        int maxSum = A.get(0);
        for (int i=0; i < A.size(); i++) {
            int a = A.get(i);
            maxSum += a;
        }
        return maxSum;
    }
}
