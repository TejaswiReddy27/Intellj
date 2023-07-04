package com.oopsinheritance;

public class Singleinheritance {
    public static void main(String[] args) {
        Manager xyz=new Manager(101,"reddy",300000,"Hyd","Developer");
        xyz.getManagerDetails();
        System.out.println();
    Engineer mno =new Engineer(102,"Teja",50000,"ndl","assdevloper");
    mno.getEngineerDetails();
    System.out.println();
    Accountant efg=new Accountant(103,"Datla",600000,"bngl","accountant");
    efg.getAccountantDetails();

    }
}
