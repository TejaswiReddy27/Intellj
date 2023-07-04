package com.sShallowCloning;
public class Employee implements Cloneable{
    int eid;
    String ename;
    int esal;
    String eadd;
    Accounts accounts;
    public int getEid() {
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
    public int getEsal() {
        return esal;
    }
    public void setEsal(int esal) {
        this.esal = esal;
    }
    public String getEadd() {
        return eadd;
    }
    public void setEadd(String eadd) {
        this.eadd = eadd;
    }
    public Accounts getAccounts() {
        return accounts;
    }
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
    public String getEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("========================");
        System.out.println("Employee id:"+eid);
        System.out.println("Employee name:"+ename);
        System.out.println("Employee sal:"+esal);
        System.out.println("Employee add:"+eadd);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("==========================");
        System.out.println("Account no:"+accounts.accNo);
        System.out.println("Account holder name:"+accounts.accHolder);
        System.out.println("Account type:"+accounts.accType);
        System.out.println("Account balance:"+accounts.accbalance);
        return null;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
