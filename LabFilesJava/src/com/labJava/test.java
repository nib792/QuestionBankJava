package com.labJava;

interface BEIT {
    String studentName(String name);

    Long rollno(Long rollNo);

    public void display();

    //    defining in the interface
    default void test1() {
        System.out.println("test1");
    }

    static void test2() {
        System.out.println("test2");
    }

}

class test implements BEIT {

    public void testDisplay() {
        System.out.println("This function is of the class test and is not associated with any function of interface " +
                "BEIt");
    }

    @Override
    public String studentName(String name) {
        return name;
    }

    @Override
    public Long rollno(Long rollNo) {
        return rollNo;
    }

    @Override
    public void display() {
        System.out.println("overridden display");

    }


    public static void main(String[] args) {
        test obj = new test();
        String pname = obj.studentName("rabin");
        System.out.println(pname);
//        now using the concept of static and calling the methods using the interface name
        BEIT.test2();
        obj.testDisplay();

    }

}
