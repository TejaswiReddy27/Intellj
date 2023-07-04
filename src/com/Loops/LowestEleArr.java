package com.Loops;

public class LowestEleArr {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=11;
        a[1]=22;
        a[2]=44;
        a[3]=33;
        a[4]=5;
        a[5]=66;

        int gt=a[0];
        int i;
        for(i=1;i<=5;i++){
            if(gt>a[i]){
                gt=a[i];
            }
        }
        System.out.println("lowest vale :"+gt);

    }

}
