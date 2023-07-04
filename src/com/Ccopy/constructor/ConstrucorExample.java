package com.Ccopy.constructor;
public class ConstrucorExample {
    public static void main(String[] args) {
        Student s=new Student();
        s.setSid(101);
        s.setSname("Sujatha");
        s.setSclass("Tenth");
        s.setSloc("Mysore");
        System.out.println("Student Details");
        System.out.println("========================");
        System.out.println("Student id:"+s.getSid());
        System.out.println("Student name:"+s.getSname());
        System.out.println("Student class:"+s.getSclass());
        System.out.println("Student location:"+s.getSloc());
        System.out.println();
        System.out.println("Reference Object");
        System.out.println("============================");
        System.out.println(s);
        System.out.println();
        System.out.println("Copy Constructor--Student Details");
        System.out.println("======================");
        Student s1=new Student(s);
        System.out.println(s1.getdetails());
        System.out.println();
        System.out.println("Reference Object");
        System.out.println("=======================");
        System.out.println(s1);
    }
}
