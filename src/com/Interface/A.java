package com.Interface;

public class A implements I {
    //changed into concrete methods bcs body is there
    @Override
    public void m1() {
        System.out.println("M1-A");
    }

    @Override
    public void m2() {
        System.out.println("M2-A");
    }

    @Override
    public void m3() {
        System.out.println("M3-A");
    }

    public void m4() {
        System.out.println("M4-A");
    }
}

