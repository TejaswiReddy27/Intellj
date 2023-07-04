package com.com.Shallowcloning;

public class Accounts implements Cloneable{
    String accNo;
    String accHolderName;
    String accType;
    int balance;
    //parameterized constructor
    Accounts (String accNo,String accHolderName,String accType,int balance){
        this.accNo=accNo;
        this.accHolderName=accHolderName;
        this.accType=accType;
        this.balance=balance;
    }




}
