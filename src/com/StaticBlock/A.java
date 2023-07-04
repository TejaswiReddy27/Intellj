package com.StaticBlock;

public class A {
    //Instance variable
    int i = 100;
    //Static variable
    static int j = 200;

    //static block
    static {
            System.out.println("SB-A");
            System.out.println(j);//inside Static block we can access static variable but not instance variable
            //System.out.println(i);//--compilation error
            A a = new A();//After creating object inside static block we can access instance variables
            System.out.println(a.i);
            //System.out.println(this.j);--Error because we cannot access this keyword inside of static block
        }
    }
