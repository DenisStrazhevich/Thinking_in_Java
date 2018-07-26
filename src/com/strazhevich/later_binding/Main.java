package com.strazhevich.later_binding;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        CppDeveloper cppDeveloper = new CppDeveloper();
        doSomething(javaDeveloper);
        doSomething(cppDeveloper);
        javaDeveloper.some();
        //JavaDeveloper.dsa dsa = javaDeveloper.new dsa(); // создание объекта через объект
        //dsa.something();
    }

    private static void doSomething(Developer developer){
        developer.writeCode();
    }
}
