package com.strazhevich.rec;

public class Main {
    public static void main(String[] args) {
        int from = 5;
        int to = 10;
        //numbersOut(to);


    }

    private static int fib(int i){
        if(i == 1) return 1;
        if(i == 2) return 1;
        System.out.println(i);
        return fib(i - 1) + fib(i - 2);
    }

    private static void numbersOut(int from, int to, int condition ){
        if (to < condition){
            return;
        }
        System.out.println(from);
        numbersOut(from + 1, to - 1, condition);
    }

    private static void numbersOut(int number ){
        if (number >= 0){
            numbersOut(number-1);
            System.out.println(number);
        }
    }
}
