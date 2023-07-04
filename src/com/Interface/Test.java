package com.Interface;
public class Test {
    public static void main(String[] args) {
        I i=new A();//can not create obj for interface only ref variable can be created
        i.m1();
        i.m2();
        i.m3();
       //i.m4();--error bcs when we create ref for interface cls we can not access implementation cls members(variables)
        System.out.println(i.x);
        System.out.println();
        A a=new A();//obj creation for implementation cls
        i.m3();
        i.m2();
        i.m1();
        i.m4();//no error occurs bcs here we created ref variable for implementation cls
        System.out.println(a.x);
        System.out.println();
        //If we declare any variable inside interface , 4 ways to access it such as
        System.out.println(I.x);//1.By using interface name
        System.out.println(i.x);//2.By using interface ref variable
        System.out.println(A.x);//3.By using implementation class name
        System.out.println(a.x);//4.By using implementation ref variable
    }
}
