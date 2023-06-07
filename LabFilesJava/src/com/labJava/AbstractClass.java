package com.labJava;

abstract class Abdf {
    //if we only want to declare a function and define it into another class
    //we use abstract
    // abstract function should always be in abstract class
    //it is the modular concept of OOp
    //which ever class inherit the abstract class should implement or override the abstract function
    //    we cannot create an object of abstract class


    public void show() {
        System.out.println("hello");
    }

    public abstract void show(int a);

}

class Base extends Abdf {

    @Override
    public void show(int a) {
        System.out.println(a);
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Abdf obj = new Base(); //creating the reference of abstract class and object of base class
        System.out.println("\nThe overridden abstract class function is displayed\n");
        obj.show(2);
        System.out.println("\nBaase abstract class Abdf show function will be displayed");
        obj.show();
    }
}

