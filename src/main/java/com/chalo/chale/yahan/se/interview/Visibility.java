package com.chalo.chale.yahan.se.interview;

/**
 * Created by hug08153 on 17-Jun-18.
 */
public class Visibility {

    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public static void main(String[] args) {
        Visibility v = new Visibility();
        System.out.println(v.a);

    }
}
