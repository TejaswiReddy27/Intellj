package com.Exclonable.settersandgetters;
public class Employee implements Cloneable{
    private int Eid;
    private String Ename;
    private String Erole;
    private String Eloc;
    private int Esal;
    //setters and getters
    public int getEid() {
        return Eid;
    }
    public void setEid(int eid) {
        Eid = eid;
    }
    public String getEname() {
        return Ename;
    }
    public void setEname(String ename) {
        Ename = ename;
    }
    public String getErole() {
        return Erole;
    }
    public void setErole(String erole) {
        Erole = erole;
    }
    public String getEloc() {
        return Eloc;
    }
    public void setEloc(String eloc) {
        Eloc = eloc;
    }
    public int getEsal() {
        return Esal;
    }
    public void setEsal(int esal) {
        Esal = esal;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
