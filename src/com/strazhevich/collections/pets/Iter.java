package com.strazhevich.collections.pets;

import java.util.*;

public class Iter {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat("Sema"));
        pets.add(new Dog("Tim"));
        pets.add(new Kitten("Alina"));
        pets.add(new Puppy("Denis"));
        Pet pet;

        for (Pet pet1 : pets) {
            pet = pet1;
            System.out.println(pet.getName());
        }

        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()){
            pet = iterator.next();
            System.out.println(pet.getName());
        }
    }
}

class ClassContainerIterator {
    public static void display(Iterator<Pet> iterator){
        int i = 0;
        Pet pet;
        while (iterator.hasNext()){
            pet = iterator.next();
            System.out.print( i + ":" + pet.getName() + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Cat("Sema"));
        pets.add(new Dog("Tim"));
        pets.add(new Kitten("Alina"));
        pets.add(new Puppy("Denis"));
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
       /* TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);*/
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        System.out.println(petsLL.element());
        System.out.println(petsLL.getFirst());
        System.out.println(petsLL.getLast());
        /*display(petsTS.iterator());*/
    }

}
