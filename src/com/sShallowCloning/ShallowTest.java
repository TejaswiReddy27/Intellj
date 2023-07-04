package com.sShallowCloning;
public class ShallowTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Accounts account=new Accounts();
        account.setAccNo(121);
        account.setAccHolder("Sujatha");
        account.setAccType("Deposit");
        account.setAccbalance(700000);
        Employee origialemployee=new Employee();
        System.out.println();
        System.out.println("Original Employee Details");
        System.out.println("=============================");
        origialemployee.setEid(101);
        origialemployee.setEname("Tejaswi");
        origialemployee.setEsal(900000);
        origialemployee.setEadd("Hyd");
        origialemployee.setAccounts(account);
        System.out.println("Employee id:"+origialemployee.getEid());
        System.out.println("Employee name:"+origialemployee.getEname());
        System.out.println("Employee sal:"+origialemployee.getEsal());
        System.out.println("Employee add:"+origialemployee.getEadd());
        System.out.println();
        System.out.println("Account Details");
        System.out.println("======================");
        System.out.println("Account No:"+account.getAccNo());
        System.out.println("Account Holder:"+account.getAccHolder());
        System.out.println("Account Type:"+account.getAccType());
        System.out.println("Account Balance:"+account.getAccbalance());
        Employee duplicateEmployee=(Employee) origialemployee.clone();
        System.out.println();
        System.out.println("Duplicate Employee Details");
        duplicateEmployee.getEmployeeDetails();
        System.out.println();
        System.out.println("original Reference Object For Employee:"+origialemployee);
        System.out.println("Duplicate Reference Object For Employee:"+duplicateEmployee);
        System.out.println();
        System.out.println("Original Reference Object For Account :"+origialemployee.accounts);
        System.out.println("Duplicate Refernce Object For Account :"+duplicateEmployee.accounts);
    }
}
