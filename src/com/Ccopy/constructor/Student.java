package com.Ccopy.constructor;
public class Student {
        private int sid;
        private String sname;
        private String sclass;
        private String sloc;
    //default Constructor
    public Student() {
    }
    //copy constructor
    public Student(Student stu){
        this.sid=stu.sid;
        this.sname=stu.sname;
        this.sclass=stu.sclass;
        this.sloc= stu.sloc;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSclass() {
        return sclass;
    }
    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
    public String getSloc() {
        return sloc;
    }
    public void setSloc(String sloc) {
        this.sloc = sloc;
    }
    public String getdetails() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclass='" + sclass + '\'' +
                ", sloc='" + sloc + '\'' +
                '}';
    }
}

