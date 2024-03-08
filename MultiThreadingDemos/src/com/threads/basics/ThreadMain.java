package com.threads.basics;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("Poppy");
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread);
        thread.setName("sam");
        int[] name = null;
        System.out.println(name[0]);


    }
}
