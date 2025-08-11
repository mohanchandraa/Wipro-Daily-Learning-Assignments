package com.learn;

import java.util.concurrent.*;

public class Assignment9 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        addJob(printQueue, "Doc1");
        addJob(printQueue, "Doc2");
        addJob(printQueue, "Doc3");
        addJob(printQueue, "Doc4");

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }

    static void addJob(ArrayBlockingQueue<String> queue, String job) {
        if (!queue.offer(job)) {
            System.out.println("Queue full, skipping: " + job);
        }
    }
}
