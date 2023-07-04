package com.IInterface.implementation;//implementation is possible in interface not in inheritance

public class A1 implements I1,I2,I3{

    @Override
    public void m1() {
        System.out.println("M1-I1");
    }
    @Override
    public void m2() {
        System.out.println("M2-I2");
    }
    @Override
    public void m3() {
        System.out.println("M3-I3");
    }
}
