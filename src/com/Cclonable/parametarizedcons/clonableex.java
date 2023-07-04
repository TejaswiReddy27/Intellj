package com.Cclonable.parametarizedcons;

public class clonableex {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Original Details");
        Student stuoriginal=new Student(101,"teja",123456,"hyd");
        stuoriginal.getStudentDetails();
        System.out.println("original ref:"+stuoriginal);
        //Duplicate object
        System.out.println("Duplicate Details");
        Object obj=stuoriginal.clone();
        Student Duplicatestudent=(Student) obj;
        System.out.println("Duplicate Student");
        Duplicatestudent.getStudentDetails();
        System.out.println("Duplicate ref"+Duplicatestudent);
    }
}
