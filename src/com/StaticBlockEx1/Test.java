package com.StaticBlockEx1;
class A {
        static int i =100;
        //static block
        static{ //we can not access static variable inside od static method
            System.out.println("SB-A");
            System.out.println(i);
        }
        //static method
        static int m1(){
            System.out.println("m1-A");
            return 147;
        }
    }
    public class Test{
        public static void main(String[] args) {
            A a=new A();
            a.m1();
            System.out.println();
            A a2=new A();

        }
    }
