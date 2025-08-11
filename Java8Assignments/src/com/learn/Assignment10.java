package com.learn;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Assignment10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
        Map<String, Long> frequency = names.stream()
                                           .collect(groupingBy(name -> name, counting()));
        System.out.println(frequency);
    }
}

