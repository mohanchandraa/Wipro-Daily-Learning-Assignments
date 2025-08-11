package com.learn;

import java.util.concurrent.*;

public class Assignment10 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> buffer = new LinkedBlockingQueue<>();

        Thread writer = new Thread(() -> {
            int i = 1;
            while (i <= 10) {
                try {
                    if (buffer.size() <= 5) {
                        buffer.put("Msg " + i);
                        System.out.println("Sent: Msg " + i);
                        i++;
                    } else {
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {}
            }
        });

        Thread reader = new Thread(() -> {
            while (true) {
                try {
                    String msg = buffer.take();
                    System.out.println("Received: " + msg);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        });

        writer.start();
        reader.start();
    }
}

