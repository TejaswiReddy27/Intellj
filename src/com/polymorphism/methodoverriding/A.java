package com.polymorphism.methodoverriding;

public class A {
    static int z=20;
    public void m1(){
        System.out.println("m1A-old functionality");
        System.out.println(z);//it won't execute bcz ww created obj for B class not for A class.
    }
}
