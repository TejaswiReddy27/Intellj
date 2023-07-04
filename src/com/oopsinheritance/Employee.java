package com.oopsinheritance;//extends--class to class or interface to implements
//implements--interface to class
public class Employee {
    private int eId;
    private String ename;
    private float esal;
    private String eloc;
    private String erole;

    public Employee(int eId, String ename, float esal, String eloc, String erole) {
        this.eId = eId;
        this.ename = ename;
        this.esal = esal;
        this.eloc = eloc;
        this.erole = erole;
    }
    //default constructoe
    //public Employee(){

    //}

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public String getEloc() {
        return eloc;
    }

    public void setEloc(String eloc) {
        this.eloc = eloc;
    }

    public String getErole() {
        return erole;
    }

    public void setErole(String erole) {
        this.erole = erole;
    }
    public void getEmployeeDetails(){
        System.out.println("employee id:"+eId);
        System.out.println("employee name:"+ename);
        System.out.println("employee salary:"+esal);
        System.out.println("employee location:"+eloc);
        System.out.println("employee role:"+erole);
    }

}

