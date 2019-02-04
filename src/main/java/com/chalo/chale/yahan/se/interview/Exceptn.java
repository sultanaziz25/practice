package com.chalo.chale.yahan.se.interview;

/**
 * Created by hug08153 on 09-Jun-18.
 */
public class Exceptn {
    int check1() {
        try {
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return -1;
    }

    int check() {
        try {
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            return 2;
        }finally {
            System.exit(400);
            System.out.println("finally");
            return 3;
        }
    }
    public static void main(String[] args) {
        Exceptn e = new Exceptn();
        System.out.println(e.check());
    }

    public static void main1(String[] args) {
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }

        // not a appropriate handler
        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught");
        }finally {
            System.out.println("Finallyyy");
        }

        // rest program will not execute
        System.out.println("Outside try-catch clause");
    }
}
