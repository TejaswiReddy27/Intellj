package com.multilevelinheritance;

public class mainclass {
    public static void main(String[] args) {
        C ref=new C();
        ref.a1();
        ref.a2();
        System.out.println(ref.i);
        System.out.println(ref.j);
        System.out.println(ref.k);
        System.out.println();

        A ref1=new A();
        ref1.a1();
        System.out.println(ref1.i);
        System.out.println();

        B ref2=new B();
        ref2.a1();
        ref2.a2();
        System.out.println(ref2.i);
        System.out.println(ref2.j);


    }
}
