package com.strazhevich.comparable;

import java.util.*;

public class ComparableMain {
    public static void main(String[] args) {
        //Set<Person> people = new TreeSet<Person>();
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Denis"));
        people.add(new Person("Alina"));
        people.add(new Person("Alina"));
        people.add(new Person("Boris"));
        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.toString());
        }

        Map<String,Object> map = new HashMap<>();
        map.put("Dsa", new Person("Denis"));
        map.put("Sda", new Person("Alina"));
        map.put("Asd", new Person("Boris"));
        Map<String,Object> map1 = new TreeMap<>(map);
        System.out.println(map);

    }
}
