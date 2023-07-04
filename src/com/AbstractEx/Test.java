package com.AbstractEx;

public class Test {
    public static void main(String[] args) {
        A a=new B();
        a.m1();
        a.m2();
        a.m3();
        //a.m4();--Error Abstract method not possible in normal cls
        System.out.println();
        B b=new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();

    }
}
