package com.strazhevich.collections.pets;

public class Puppy implements Pet {
    private String name;

    public Puppy() {
    }

    public Puppy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                '}';
    }
}
