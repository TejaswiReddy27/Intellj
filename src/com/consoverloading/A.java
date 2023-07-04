package com.consoverloading;//consover loading means declare more than one constructor with the same classname and diff parameter list

public class A {
    int i,j,k;
    //default constructor
    A(){

    }
    //parameterized constructor
    A(int x){
        i=x;
    }
    A(int x,int y){
        i=x;
        j=y;
    }
     A (int x,int y,int z){
        i=x;
        j=y;
        k=z;
    }



    public void add(){
    System.out.println("addition:"+(i+j+k));
        }
}