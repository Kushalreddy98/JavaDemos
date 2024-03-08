package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> {
            System.out.println("Doing pooling");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("ram", 10));
        });
        executorService.execute(() -> {
            System.out.println("Doing Task");
            Greetings greetings = new Greetings();
            System.out.println(greetings.sayHello("Kus"));

        });
        executorService.execute(() -> {
            System.out.println("Reading from DB");
        });
        executorService.shutdown();
    }
}
