package com.strazhevich.later_binding;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writing java code...");
    }
    private interface asd {
        void something();
    }

    private dsa dsa = new dsa();

    public class dsa implements asd{
        JavaDeveloper javaDeveloper = JavaDeveloper.this;
        @Override
        public void something() {
            System.out.println("Hello");
        }


    }

    void some(){
        dsa.something();
    }
}
