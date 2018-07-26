package com.strazhevich.collections.pets;

import java.util.*;

public class AClient {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Sema");
        Dog dog = new Dog();
        dog.setName("Tim");
        Kitten kitten = new Kitten();
        kitten.setName("Alina");


        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        pets.add(kitten);

        System.out.println("1 : " + pets);

        Puppy puppy = new Puppy();
        puppy.setName("Denis");
        pets.add(puppy);
        System.out.println("2 : " + pets);

        System.out.println("3 contains : " + pets.contains(puppy));

        pets.remove(puppy);

        Pet p = pets.get(2);
        System.out.println("4 IndexOf : " + p + " " + pets.indexOf(p));
        System.out.println("5 remove : " + pets.remove(p));
        System.out.println("6 : " + pets);
        pets.add(2, p);
        System.out.println("7 : " + pets);
        pets.add(3,new Cat("Maks"));
        System.out.println("8 : " + pets);
        List<Pet> sub = pets.subList(1,3);
        System.out.println("Sublist : " + sub);
        System.out.println("9 containsAll : " + pets.containsAll(sub));
        System.out.println("All pets that contains both collections " );
        for (Pet pet : sub) {
            if (pets.contains(pet)){
                System.out.println(pet);
            }
        }
        System.out.println("Pets that sub collection not contain ");
        for (Pet pet : pets) {
            if(!sub.contains(pet)){
                System.out.println(pet);
            }
        }
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(3));
        System.out.println("sub : " + sub);
        copy.retainAll(sub);
        System.out.println("RetainAll to copy : " + copy);
        copy = new ArrayList<>(pets);
        copy.remove(2);
        System.out.println("Remove object(2) in new copy :" + copy);
        copy.removeAll(sub);
        System.out.println("Remove all specified elements : " + copy);
        copy.set(0, new Kitten("Alina"));
        System.out.println("Set new object on index : " + copy);
        copy.add(new Puppy("Den"));
        copy.addAll(1,sub);
        System.out.println("Insert in the middle of the list " + copy);
        System.out.println("Pets is empty? : " + pets.isEmpty());
        pets.clear();
        System.out.println("After clear, pets is empty? : " + pets.isEmpty());
        pets.addAll(sub);
        Object[] o = pets.toArray();
        System.out.println("One element of object array : " + o[1]);
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
