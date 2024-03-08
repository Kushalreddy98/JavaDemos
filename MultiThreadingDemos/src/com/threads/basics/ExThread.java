package com.threads.basics;

class Child extends Thread{

    public Child(String name, int priority) {
        super(name);
        System.out.println(this);
        //this.start();
    }

    @Override
    public void run() {
        for(int i=1;i<11;i++){
            String name = Thread.currentThread().getName();
            System.out.println("5"+"x"+i+"="+(i*5)+" "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ExThread {
    public static void main(String[] args) {
//        Child child1 = new Child("child-1",10);
//        Child child2 = new Child("child-2",6);
        Child child3 = new Child("child-3",3);
        child3.setDaemon(true);
        child3.start();
        System.out.println();
        for(int i=1;i<11;i++){
            String name = Thread.currentThread().getName();
            System.out.println("10"+"x"+i+"="+(i*10)+" "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try{
        //child1.join();
       // child2.join();
        child3.join();
        }catch (InterruptedException e){
            e.getMessage();
        }
        System.out.println("Main completed");
    }
}
