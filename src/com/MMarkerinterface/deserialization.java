package com.MMarkerinterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f=new FileInputStream("C:\\Users\\TEJAWSWI REDDY\\OneDrive\\Desktop\\student.ser");
        ObjectInputStream o=new ObjectInputStream(f);

        Student s1= (Student) o.readObject();
        System.out.println();
        System.out.println(s1);
        f.close();
        o.close();
    }
}
