package com.strazhevich.collections;

import java.util.*;


public class Example2 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        System.out.println(collection);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,18);
        //list.add(21);  Ошибка, массив не должен изменяться в размерах!!!!!!!
        System.out.println(list);
    }
}
