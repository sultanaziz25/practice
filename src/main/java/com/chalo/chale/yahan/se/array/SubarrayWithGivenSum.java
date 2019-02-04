package com.chalo.chale.yahan.se.array;

/**
 * Created by hug08153 on 31-May-18.
 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        System.out.println(subarrWithGivenSum(new int[]{1,2,3,7,5}, 12));
        System.out.println(subarrWithGivenSum(new int[]{1,2,3,4,5,6,7,8,9,10}, 15));
        System.out.println(subarrWithGivenSum(new int[]{1,2,3,4,5,6,7,8,9,10}, 153333));
    }

    private static String subarrWithGivenSum(int[] arr, int sum) {
        int i = 0,j = 0,n = arr.length, cummSum = arr[i];
        while (i>=0 && j<n) {
            if (i == n-1 || j == n-1) {
                break;
            }

            if (cummSum  < sum) {
                cummSum += arr[++j];
            } else if (cummSum > sum) {
                cummSum -= arr[i];
                i++;
            } else {
                break;
            }
        }


        if (i == n-1 || j == n-1) {
            return -1 + "";
        }
        return i+","+j;
    }
}
