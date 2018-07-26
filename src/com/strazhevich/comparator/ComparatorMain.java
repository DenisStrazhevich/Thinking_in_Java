package com.strazhevich.comparator;

import java.util.*;

public class ComparatorMain {
    public static void main(String[] args) {
        PersonComparator comparator = new PersonComparator();
        //Set<Person> persons = new TreeSet<>(comparator);
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Denis",21));
        persons.add(new Person("Alina",19));
        persons.add(new Person("Bob",44));
        persons.sort(comparator);
        //Collections.reverse(persons);
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
