package com.polymorphism;

public class InheritanceOverloadingExample {
    public static void main(String[] args) {
        //accesing in 3 ways 1.by creating obj to superclass
        Superclass ref=new Superclass();
        ref.printMessage();

        //3.by creating obj to subclass
        Subclass ref1=new Subclass();
        ref1.printMessage();
        ref1.printMessage("java");

        // 2nd way
        //creating obj to subclass  and reference variable to superclass
        Superclass s=new Subclass();
        s.printMessage();//only superclass methods can be accesed
        //s.printMessage("hi");//---throws error bcs can not access subclass methods in this way

    }
}
