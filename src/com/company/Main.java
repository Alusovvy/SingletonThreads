package com.company;


import javax.sound.sampled.*;

import java.io.IOException;


public class Main {

    public static class SingletonThread implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(String.valueOf("Yesss"));
            System.out.println(singleton.value);
            System.out.println(singleton);
        }
    }

    public static class SingletonThread2 implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(String.valueOf("Nooooo"));
            System.out.println(singleton.value);
            System.out.println(singleton);
        }
    }



    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Thread t1 = new Thread(new SingletonThread());
        Thread t2 = new Thread(new SingletonThread2());
        t1.start();
        t2.start();
    }
}
