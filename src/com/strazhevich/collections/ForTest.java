package com.strazhevich.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ForTest {


    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
            System.out.println(mas[i]);
        }
        mas[2] = 1;
        mas[3] = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for (int ma : mas) {
            map.put(ma, map.get(ma) == null ? 1 : map.get(ma) + 1);
        }

        System.out.println(map);

        for (int i = 0; i < mas.length; i++) {
            map.put(i,mas[i]);
        }

        System.out.println(map);






    }




}
