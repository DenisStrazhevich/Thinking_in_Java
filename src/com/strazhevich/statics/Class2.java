package com.strazhevich.statics;

import com.strazhevich.later_binding.CppDeveloper;

public class Class2 extends Class1 {

    public Class2(int i) {

    }

    public Class2() {
        this(1);
    }

    @Override
    public CppDeveloper aaa(int v, String b){
        System.out.println("aaa");
        CppDeveloper cppDeveloper = new CppDeveloper();
        return cppDeveloper;
    }


}
