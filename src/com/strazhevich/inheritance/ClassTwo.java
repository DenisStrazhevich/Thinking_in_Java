package com.strazhevich.inheritance;

public class ClassTwo extends ClassOne {

    static {
        System.out.println("2");
    }

    ClassTwo(){
        super(2);
        System.out.println("Class two");
    }

}
