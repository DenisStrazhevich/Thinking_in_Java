package com.strazhevich.inheritance;

public class ClassOne {

    static {
        System.out.println("1");
    }

    ClassOne(int i){
        System.out.println("Class one " + i);
    }

    public ClassOne() {

    }

    public int sss(){
       System.out.println("");
       return 1;
   }
}
