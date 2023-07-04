package com.com.Shallowcloning;
public class Employee implements Cloneable{
    int eid;
    String ename;
    float esal;
    String eadd;
    Accounts accounts;
    //parameterized constructor
    Employee(int eid,String ename,float esal,String eadd,Accounts accounts){
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
        this.eadd=eadd;
        this.accounts=accounts;
    }
    public void getEmployeedetails(){
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
        System.out.println("Account holder name:"+accounts.accHolderName);
        System.out.println("Account type:"+accounts.accType);
        System.out.println("Account balance:"+accounts.balance);
    }
    //from object class we override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
