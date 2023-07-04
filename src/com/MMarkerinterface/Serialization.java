package com.MMarkerinterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student s=new Student(101,"teja",123456,"hyd");

        FileOutputStream f=new FileOutputStream("C:\\Users\\TEJAWSWI REDDY\\OneDrive\\Desktop\\student.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);

        o.writeObject(s);
        f.close();
        o.close();
        System.out.println("serialization");
    }
}
