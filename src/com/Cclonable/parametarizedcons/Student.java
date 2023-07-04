package com.Cclonable.parametarizedcons;

public class Student implements Cloneable{
    private int sid;
    private String sname;
    private int sphno;
    private String sloc;

    Student(int sid,String sname,int sphno,String sloc){
        this.sid=sid;
        this.sname=sname;
        this.sphno=sphno;
        this.sloc=sloc;
    }
    public void getStudentDetails(){
        System.out.println("student id:"+sid);
        System.out.println("student name:"+sname);
        System.out.println("student phno:"+sphno);
        System.out.println("student loc:"+sloc);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
