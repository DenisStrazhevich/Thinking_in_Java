package com.strazhevich.collections;

import java.util.ArrayList;
import java.util.List;

class Apple {

    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}
class Example1{
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (int i = 0; i < apples.size(); i++) {
            if(i % 2 == 0) {
                System.out.println(apples.get(i).getId());
            }
        }

        for (Apple apple : apples) {
            System.out.println(apple.getId());
        }
    }
}