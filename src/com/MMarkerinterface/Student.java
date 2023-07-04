package com.MMarkerinterface;
import java.io.Serializable;
public class Student implements Serializable {
    private int sid;
    private String sname;
    private int phno;
    private String sloc;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", phno=" + phno +
                ", sloc='" + sloc + '\'' +
                '}';
    }
    Student(int sid, String sname, int phno, String sloc){
        this.sid=sid;
        this.sname=sname;
        this.phno=phno;
        this.sloc=sloc;
    }
}
