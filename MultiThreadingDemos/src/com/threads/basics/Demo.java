package com.threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi");
    }
}

public class Demo {
    public static void main(String[] args) {
        Runnable task1 = new A();
        Runnable task = () -> {
            System.out.println("task 1");
        };
        Thread t1 = new Thread(task, "pop");
        Thread t2 = new Thread(() -> {
            System.out.println("task 2");
        }, "pop");
        t1.start();
        t2.start();

        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            es.execute(task1);
        }
    }
}
