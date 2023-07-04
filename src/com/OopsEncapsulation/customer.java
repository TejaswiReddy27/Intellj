package com.OopsEncapsulation;

public class customer {
    public static void main(String[] args) {
        Encapsulationex ex = new Encapsulationex();
        ex.setFullname("Tejaswi");
        System.out.println("Fullname:" + ex.getFullname());
        ex.setGender("Female");
        ex.setAge(21);
        ex.setPhno(970180386);
        ex.setCity("Nandyal");
        ex.setPostalcode(518134);
        ex.setCountry("India");
        ex.setstate("Andhra pradesh");
        System.out.println("Gender:" + ex.getGender());
        System.out.println("Age:" + ex.getAge());
        System.out.println("Phno:" + ex.getPhno());
        System.out.println("City:" + ex.getCity());
        System.out.println("PostalCode:" + ex.getPostalcode());
        System.out.println("State:" + ex.getstate());
        System.out.println("Country:" + ex.getcountry());

    }
}
