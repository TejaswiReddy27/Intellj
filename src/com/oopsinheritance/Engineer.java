package com.oopsinheritance;

public class Engineer extends Employee{
    public Engineer(int eId,String ename,float esal,String eloc,String erole) {
        super(eId,ename,esal,eloc,erole);
        eId=eId;
        ename=ename;
        esal=esal;
        eloc=eloc;
        erole=erole;
    }
    public void getEngineerDetails(){

        getEmployeeDetails();
    }
}
