package com.IInterface.implementation;

public class Test {
    public static void main(String[] args) {
        I1 i1 =new A1();//can not create obj for interface
        i1.m1();//when we extend all classes into one single interface no need to create multiple reference variables for all interfaces
        i1.m2();
        i1.m3();
        System.out.println();
        I2 i2=new A1();
        i2.m2();
        System.out.println();
        I3 i3=new A1();
        i3.m3();
        System.out.println();
        A1 a=new A1();//obj for class A1 and ref variable for A1
        a.m1();
        a.m2();
        a.m3();
    }
}
