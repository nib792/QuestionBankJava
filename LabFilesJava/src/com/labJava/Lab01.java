package com.labJava;

public class Lab01 {

    static int a = 12; //static variable

    void method() {
        int n = 123; //local variable
        System.out.println("The vlaue of n is" + n);
    }

    public static void main(String[] args) {
//        variables in java
        int data = 45; //instance variable
        System.out.println("The value of instance variable is  " + data);
        System.out.println("The value static variable is " + a);
//        method();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = a + b + c;
        System.out.println("The value is " + d);
        System.out.println();
        System.out.println("Learning widening and typecasting in java");
        System.out.println("Widening");
        int value = 10;
        float fValue = value;
        System.out.println("The value of integer to be widened " + value);
        System.out.println("The value of float after being widened from integer " + fValue);
        System.out.println("\n\n");
        System.out.println("Narrowing or Typecasting in JAVA");
        float fTvalue = 2.3f;

        int iTValue = (int) fTvalue;
        System.out.println("The vlaue to be narrowed is in float = " + fTvalue);
        System.out.println("The value that is being narrowed from float to integer is " + iTValue);
        System.out.println("\n\n");
        System.out.println("Overflow in java");
        int oValue = 130;
        byte bt = (byte) oValue;
        System.out.println("Integer value is " + oValue);
        System.out.println("Byte value is " + bt);
        System.out.println("\n");
        System.out.println("adding lower type in java");
        byte aV = 10;
        byte bV = 10;
//        we cant write like byte c=a+b; not like in int will lead to a compilation error
        byte cV = (byte) (a + b);
        System.out.println(cV);

    }
}
