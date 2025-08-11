package com.learn;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Assignment11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Anita", "Amma", "Bob");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        List<String> result = names.stream()
                                   .filter(startsWithA.and(endsWithA))
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
