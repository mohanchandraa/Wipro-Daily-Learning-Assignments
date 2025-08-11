package com.learn;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Alice", "John", "Charlie");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);
    }
}
