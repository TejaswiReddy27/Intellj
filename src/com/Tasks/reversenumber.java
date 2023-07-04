package com.Tasks;

public class reversenumber {
    public static void main(String[] args) {
        int number=9876;
        int reverse=0;
        while (number !=0) {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("Reverse of a number is:"+ reverse);
    }
}
