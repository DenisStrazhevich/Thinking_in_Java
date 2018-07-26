package com.strazhevich.statics;

public class Client {
    public static void main(String[] args) {

        Class1 class1 = new Class1();


    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    };
    Thread thread = new Thread(runnable);
    thread.start();
    }
}
