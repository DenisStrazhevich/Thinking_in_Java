package com.strazhevich.collections;

import com.strazhevich.collections.pets.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Maps {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
class PetMaps {
    public static void main(String[] args) {
        Map<String,Pet> map = new HashMap<>();
        map.put("Cat",new Cat("Maks"));
        map.put("Dog", new Dog("Tim"));
        map.put("Kitten", new Kitten("Alina"));
        map.put("Puppy", new Puppy("Denis"));
        System.out.print(map);
        Pet kitten = map.get("Kitten");
        System.out.println(kitten);
        System.out.println(map.containsKey("Puppy"));
        System.out.println(map.containsValue(kitten));
    }
}
