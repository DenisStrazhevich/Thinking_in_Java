package com.strazhevich.statics;

import com.strazhevich.later_binding.Developer;
import com.strazhevich.later_binding.JavaDeveloper;

public class Class1  {

    public Class1() {

    }
    public void som()throws Exception{

    }
    Developer aaa(int a, String b){
        System.out.println("sss");
        Developer developer = new JavaDeveloper();
        return developer;
    }
}
