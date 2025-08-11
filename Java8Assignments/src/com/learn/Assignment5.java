package com.learn;

import java.util.*;
import java.util.stream.*;

public class Assignment5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie");
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());
        System.out.println(result);
    }
}
