package com.chalo.chale.yahan.se.interview;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by hug08153 on 08-Jun-18.
 */
public class Main {

    final static String str;
    static {
        str = "Hi";
        //str = "hey";
    }


    final int x;
    {
        x =10;
    }


    public static void main(String[] args) {
        List l = new ArrayList();
        Main m = new Main();
        Main m1 = new Main();

        l.add(m);
        l.add(m1);
        Collections.sort(l);


        HashMap hs = new HashMap();
        hs.put(2, "sd");
        hs.put("2", "sd");

        Boolean b1= new Boolean("TRuE");
        Boolean b2= new Boolean("true");
        System.out.println(b1.equals(b2));

byte sw = 65;
        switch (sw) {
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
            case 2:
                System.out.println("two");
                break;
            case 'A':
                System.out.println("A");
                break;
        }

        System.out.println(method());
        System.out.println('a' + "a");
        float f = 10.2f;
        double d = 10.2;
        System.out.println(f == d);

        int h=2,b[] = new int[2];
        System.out.println("--"+b[h]);
        //System.out.println(new Exception().printStackTrace());



        ArrayList<Number> n = new ArrayList<Number>();
        n.add(new Integer(6));
        ArrayList<Integer> i = new ArrayList<Integer>();

        System.out.println(new Main().x);
        //i = (ArrayList<Integer>)n;

        //Hashtable<String, String> h = new Hashtable<String, String>();


    }

    public static  int method() {
        try {
            throw  new ClassNotFoundException();
        } catch (Exception e) {
            throw  new NullPointerException();
        }
    }

}
