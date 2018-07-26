package com.strazhevich.initialization;



public class SomeClass   {
    private int i;
    private int a;
    {
        i = 5;
        a = 3;
        System.out.println(i + a);
    }

    SomeClass(){
        System.out.println(i);
    }



}
