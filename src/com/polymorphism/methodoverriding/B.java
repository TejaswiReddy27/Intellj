package com.polymorphism.methodoverriding;

public class B extends A{
    static int i=100;
    public void m1(){
        System.out.println(i);
        System.out.println("m1B-new functionality");
        System.out.println(i);
    }
}
