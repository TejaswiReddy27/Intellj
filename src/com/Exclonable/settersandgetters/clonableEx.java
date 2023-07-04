package com.Exclonable.settersandgetters;
public class clonableEx {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee=new Employee();
        employee.setEid(101);
        employee.setEname("Nikhil");
        employee.setEsal(123456);
        employee.setErole("developer");
        employee.setEloc("chennai");
        System.out.println("Emp Original Details");
        System.out.println("===========================");
        System.out.println("Employee id:"+employee.getEid());
        System.out.println("Employee name:"+employee.getEname());
        System.out.println("Employee sal:"+employee.getEsal());
        System.out.println("Employee role:"+employee.getErole());
        System.out.println("Employee loc:"+employee.getEloc());
        System.out.println();
        System.out.println("Student original ref object:"+employee);
        System.out.println();
        System.out.println("Student Duplicate Details");
        System.out.println("============================");
        Object o=employee.clone();
        Employee duplicatedetails=(Employee) o;
        System.out.println("Employee id:"+duplicatedetails.getEid());
        System.out.println("Employee name:"+duplicatedetails.getEname());
        System.out.println("Employee sal:"+duplicatedetails.getEsal());
        System.out.println("Employee role:"+duplicatedetails.getErole());
        System.out.println("Employee loc:"+duplicatedetails.getEloc());
        System.out.println();
        System.out.println("Student Duplicate Details:"+duplicatedetails);
    }
}
