package com.strazhevich.multithreading;

class EggVoice extends Thread{

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg!");
        }

    }
}

public class ChickenVoice {
    private static EggVoice eggVoice;

    public static void main(String[] args) throws InterruptedException {
        eggVoice = new EggVoice();
        Thread.sleep(1000);
        System.out.println("Ready");
        Thread.sleep(1000);
        System.out.println("Steady");
        Thread.sleep(1000);
        System.out.println("Go!!!!!!!!!!");
        eggVoice.start();

        for(int i = 0; i < 5; i++){
            Thread.sleep(1000);
            System.out.println("Chicken!");
        }

        if(eggVoice.isAlive()){
            eggVoice.join();
            System.out.println("Egg first.");
        } else {
            System.out.println("Chicken first.");
        }
        System.out.println("The end.");
    }
}
