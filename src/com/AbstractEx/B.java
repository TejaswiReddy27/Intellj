package com.AbstractEx;

public class B extends A{
    @Override
    void m2() {
        System.out.println("m2-B");
    }

    @Override
    void m3() {
        System.out.println("m3-B");

    }//Declaring normal method in subclass. In normal cls abstract methods are not possible only concrete methods are possible
    void m4(){
        System.out.println("m4-B");


    }
}
