package com.oopsinheritance;

public class Manager extends Employee{
    public Manager(int eId,String ename,float esal,String eloc,String erole) {
        super(eId,ename,esal,eloc,erole);
        eId=eId;
        ename=ename;
        esal=esal;
        eloc=eloc;
        erole=erole;
    }
    public void getManagerDetails(){

        getEmployeeDetails();
    }

}
