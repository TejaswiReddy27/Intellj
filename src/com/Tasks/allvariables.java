package com.Tasks;

public class allvariables {
    static int i=27;//static variable
    int p=29;//instance variable
    public static void main(String[] args) {
        String a="Tejaswi";//local variable
        allvariables ref=new allvariables();//object creation
        System.out.println("Instance Variable:" + ref.p);//calling instance variable
        System.out.println("Static variable:" + allvariables.i);//calling static variable
        System.out.println("Local variable:" + a);//calling local variable
    }
}
