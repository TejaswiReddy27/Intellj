package com.com.Shallowcloning;

public class shallowtest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //contained object
        Accounts accounts=new Accounts("A-123","Teja","Saving",19000000);
        //container object
        Employee originalEmployee=new Employee(123,"Sujatha",458999f,"hyd",accounts);

        System.out.println("original employee details");
        originalEmployee.getEmployeedetails();

        //duplicate
        System.out.println();
        Employee duplicateEmployee=(Employee) originalEmployee.clone();
        System.out.println("Duplicate Employee Details");
        duplicateEmployee.getEmployeedetails();
        System.out.println();
        System.out.println("original refrence object:"+originalEmployee);
        System.out.println("Duplicate ref obj:"+duplicateEmployee);
        System.out.println();
        System.out.println("Original account details:"+originalEmployee.accounts);
        System.out.println("Duplicate account details:"+duplicateEmployee.accounts);
    }
}
