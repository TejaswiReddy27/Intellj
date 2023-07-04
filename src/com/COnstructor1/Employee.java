package com.COnstructor1;
public class Employee {
    private int eid;
    private String ename;
    private int esalary;
    private String erole;
    private String eloc;
    //default constructor
    public Employee(){
    }
    //parameterized constructor
    public Employee(int eid, String ename, int esalary, String erole, String eloc){
        this.eid=eid;
        this.ename=ename;
        this.esalary=esalary;
        this.erole=erole;
        this.eloc=eloc;
    }
    public Employee(Employee abc){ //copy constructor
        this.eid=abc.eid;
        this.ename=abc.ename;
        this.esalary=abc.esalary;
        this.erole=abc.erole;
        this.eloc= abc.eloc;
    }
//setters and getters
   /* public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    public String getErole() {
        return erole;
    }

    public void setErole(String erole) {
        this.erole = erole;
    }

    public String getEloc() {
        return eloc;
    }

    public void setEloc(String eloc) {
        this.eloc = eloc;
    }*/


    public String getdetails() {
        return "copyconstructor{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esalary=" + esalary +
                ", erole='" + erole + '\'' +
                ", eloc='" + eloc + '\'' +
                '}';
    }
}
