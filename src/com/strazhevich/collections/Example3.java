package com.strazhevich.collections;

import java.util.*;

public class Example3 {
    private static Collection fill(Collection<String> collection){
        collection.add("dog");
        collection.add("cat");
        collection.add("puppy");
        collection.add("kitten");
        collection.add("dog");
        return collection;
    }



    private static Map fill(Map<String,String> map){
        map.put("dog","Tim");
        map.put("cat", "Sema");
        map.put("puppy", "Denis");
        map.put("kitten", "Alina");
        map.put("dog","Tim");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));

    }
}
