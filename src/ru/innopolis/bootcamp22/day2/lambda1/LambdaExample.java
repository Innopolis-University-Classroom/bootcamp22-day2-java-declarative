package ru.innopolis.bootcamp22.day2.lambda1;


/*
* Task 1. Replace the Following Runnables with lambda expressions
* */
public class LambdaExample {

    public static void main(String[] args) {
        doJob();
    }

    public static void doJob() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
                sleepThread(1000);
                System.out.println("1");
                sleepThread(1000);
                System.out.println("1");
                sleepThread(1000);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2");
                sleepThread(1000);
                System.out.println("2");
                sleepThread(1000);
                System.out.println("2");
                sleepThread(1000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("3");
                sleepThread(1000);
                System.out.println("3");
                sleepThread(1000);
                System.out.println("3");
                sleepThread(1000);

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void sleepThread(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
