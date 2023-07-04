package com.COnstructor1;

public class copyconstructorex {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        System.out.println("=====================");
        Employee ref=new Employee(101,"Teja",20000,"Developer","Bngl");
        System.out.println(ref.getdetails());
        System.out.println();
        System.out.println("Reference Object");
        System.out.println("=======================");
        System.out.println(ref);
        System.out.println();
        System.out.println("Copy Constructor--Employee Details");
        System.out.println("======================");
        Employee ref1=new Employee(ref);
        System.out.println(ref1.getdetails());
        System.out.println();
        System.out.println("Reference Object");
        System.out.println("=======================");
        System.out.println(ref1);

    }
}
