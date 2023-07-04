package com.StaticBlockEX2;
class A {
    static { //static block
        System.out.println("SB-A");
    }
    static int i = m1();//static variable
    static int m1() {//static method
        System.out.println("STATIC M1-A");
        return 299;
    }
    A() { //default Constructor
        System.out.println("A-constructor");
    }
   //instance block
    {
        System.out.println("IB-A");
    }
    int j =m2();//instance variable
    //Instance method
    int m2(){
        System.out.println("INSTANCE M2-A");
        return 55;
    }
}
public class Test {
    public static void main(String[] args) {
    A a =new A();
    System.out.println(A.i);
    a.m1();
    a.m2();
    System.out.println(a.j);
    System.out.println();
    //System.out.println(a.m2());
    A a2 =new A();
    System.out.println();
    A a3=new A();
    }
}
