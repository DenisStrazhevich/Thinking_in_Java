package com.strazhevich.collections.pets;

public class Kitten implements Pet {
    private String name;

    public Kitten(String name) {
        this.name = name;
    }

    public Kitten() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "name='" + name + '\'' +
                '}';
    }
}
