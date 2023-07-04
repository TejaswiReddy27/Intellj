package com.polymorphism.com.overridingstaticmethod;

public class A {
    static void m1(){
        System.out.println("superclass");

    }
}
//Remove Static in both A and B class then Check the o/p values
//After removing static in method the o/p is superclass,subclass,subclass
//if we don't remove static the o/p is superclass,subclass,superclass