package com.oopsinheritance;

public class Accountant extends Employee{
    public Accountant(int eId,String ename,float esal,String eloc,String erole) {
        super(eId,ename,esal,eloc,erole);
        eId=eId;
        ename=ename;
        esal=esal;
        eloc=eloc;
        erole=erole;
    }
    public void getAccountantDetails(){

        getEmployeeDetails();
    }
}
