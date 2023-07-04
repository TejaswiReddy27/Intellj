package com.Loops;

import java.util.SortedSet;

public class arrays {
    public static void main(String[] args) {
        int count=0;
        int a[]=new int[5];
        for(int i=0;i<=4;i++){
            a[i]=i*10;
            count= count +a[i];
        }
        System.out.println("count: "  +count);
    }

}
