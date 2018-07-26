package com.strazhevich.multithreading;


class Incrementator extends Thread{

    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public void changeAction(){
        mIsIncrement = !mIsIncrement;
    }

    public void finish(){
        mFinish = true;
    }

    @Override
    public void run() {

        do{
            if(!mFinish){
                if(mIsIncrement){
                    Program.mValue++;
                } else {
                    Program.mValue--;
                }
                System.out.println(Program.mValue + " ");
            } else {
                return;
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true);

    }
}

class InterruptIncrementftor extends Thread{
    private volatile boolean mIsIncrement = true;

    public void changeAction(){
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do{
            if(!Thread.interrupted()){
                if (mIsIncrement){
                    Program.mValue++;
                }
                else {
                    Program.mValue--;
                }

                 System.out.println(Program.mValue + " ");
            } else {
                return;
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
        while (true);
    }
}

public class Program {
    public static int mValue = 0;
    private static Incrementator incrementator;
    private static InterruptIncrementftor interruptIncrementftor;
    public static void main(String[] args) {
        //incrementator = new Incrementator();
        interruptIncrementftor = new InterruptIncrementftor();
        System.out.println("The value is ");
        //incrementator.start();
        interruptIncrementftor.start();
        for(int i = 1; i <= 3; i++){
            try {
                Thread.sleep(i*2*1000);
            } catch (InterruptedException e) {}
            //incrementator.changeAction();
            interruptIncrementftor.changeAction();
        }
        //incrementator.finish();
        interruptIncrementftor.interrupt();
    }
}
