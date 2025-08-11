package com.learn;

import java.util.*;

public class Assignment12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Alice");
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}
