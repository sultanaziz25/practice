package com.chalo.chale.yahan.se.stack;

import java.util.Map;

/**
 * Created by hug08153 on 10-Jan-18.
 */
public class Stack {
    private int arr[];
    private int TOP;
    private int size;

    public int peek() {
        return arr[TOP];
    }

    public void push(int x) throws Exception {
        if (arr.length == size) {
            throw new Exception("Stackoverflow exception");
        }
        arr[++TOP] = x;
        Character character = new Character('{');
        Map<Character, Character> map = null;
        //"".cha
    }

    public int pop() throws Exception {
        if (arr.length == 0) {
            throw new Exception("Stackunderflow exception");
        }
        int d = arr[TOP--];
        return d;
    }

    public Stack() {
        this.size = 10;
        init();
    }


    public Stack(int size) {
        this.size = size;
        init();
    }

    private void init() {
        arr = new int[this.size];
    }

}