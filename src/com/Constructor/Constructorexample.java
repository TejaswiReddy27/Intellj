package com.Constructor;

public class Constructorexample {
    private String cname;
    private int phno;
    private String cloc;
    private  String ccountry;
    public Constructorexample(){
    }
    public Constructorexample(String cname, int phno, String cloc, String ccountry) {
        this.cname = cname;
        this.phno = phno;
        this.cloc = cloc;
        this.ccountry = ccountry;
    }

    @Override
    public String toString() {
        return "Constructorexample{" +
                "cname='" + cname + '\'' +
                ", phno=" + phno +
                ", cloc='" + cloc + '\'' +
                ", ccountry='" + ccountry + '\'' +
                '}';
    }
}
