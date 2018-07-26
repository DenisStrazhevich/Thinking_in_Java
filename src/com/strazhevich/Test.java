package com.strazhevich;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       // List<Integer> list2 = new ArrayList<>();
        //list2 = list.subList(2,5);
        //list.removeAll(list2);



        System.out.println(list);

        for (int i = 4; i >= 2; i--) {
            list.remove(i);
        }

        System.out.println(list);

        TestObj testObj = new TestObj(1,2);
        TestObj testObj2 = testObj;
        System.out.println(testObj.hashCode());
        System.out.println(testObj2.hashCode());
        Class clas = testObj.getClass();


    }

}
