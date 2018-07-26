package com.strazhevich;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int i = 47;

    public static void main(String[] args) {

        List<String> surnames = new ArrayList<>();
        Map<String,Integer> maps = new HashMap<>();
        surnames.add("D");
        surnames.add("S");
        surnames.add("D");
        for (String surname : surnames) {
            if(maps.get(surname) != null){
                maps.put(surname,maps.get(surname) + 1);
            } else maps.putIfAbsent(surname, 1);
            //maps.put(surname, maps.get(surname) == null ? 1 : maps.get(surname) + 1);
        }

        //surnames.forEach(e-> maps.put(e,maps.get(e) == null ? 1 : maps.get(e) + 1));

        for (Map.Entry<String,Integer> map : maps.entrySet()) {
            System.out.printf("Key: %s, value: %d \n", map.getKey(), map.getValue());
        }


    }
}
