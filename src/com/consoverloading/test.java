package com.consoverloading;

public class test {
    public static void main(String[] args) {
        A ref=new A();
        ref.add();
        A ref1=new A(10);
        ref1.add();
        A ref2=new A(10,20);
        ref2.add();
        A ref3=new A(10,20,30);
        ref3.add();

    }
}
