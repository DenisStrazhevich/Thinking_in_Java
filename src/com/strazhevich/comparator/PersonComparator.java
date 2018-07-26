package com.strazhevich.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
       if (o1.getAge() > o2.getAge()){
           return 1;
       }
       if (o1.getAge() < o2.getAge()){
           return -1;
       }
        return 0;
        // return o1.getName().compareTo(o2.getName());
    }
}
