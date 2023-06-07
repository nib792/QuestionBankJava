package com.labJava;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        System.out.println("Arithmetic operators in java");
        int fifthP = a + b;
        int fourthP = a - b;
        int thirdP = a * b;
        int secP = a / b;
        int firstP = a % b;
        System.out.print("The priority will be in the order of modulo\n,divison ,\nmultiplication,\nsubtraction and\n" +
                "only addition\n");

        System.out.println(firstP);
        System.out.println(secP);
        System.out.println(thirdP);
        System.out.println(fourthP);
        System.out.println(fifthP);
        System.out.println("\n Assignment operators in java\n");
        c = a;
        c += b;
        c -= b;
        c *= b;
        c /= b;
        c %= b;
        System.out.println(c);
        System.out.println("\n Comparison Operators in Java\n");

        // Comparison Operators
        boolean result = (a == b);
        result = (a != b);
        result = (a > b);
        result = (a < b);
        result = (a >= b);
        result = (a <= b);

        System.out.println("\nLogical Operators in java");
        // Logical Operators
        result = (a > b) && (a < c);
        result = (a > b) || (a < c);
        result = !(a > b);


    }
}
