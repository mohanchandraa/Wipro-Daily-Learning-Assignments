package com.learn;

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class Assignment3 {
    public static void printMessage(Printer printer) {
        printer.print("Hello, Java 8!");
    }

    public static void main(String[] args) {
        printMessage(msg -> System.out.println(msg));
    }
}
