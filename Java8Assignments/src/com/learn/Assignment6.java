package com.learn;

import java.util.*;
import java.util.stream.*;

public class Assignment6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jonathan", "Amy", "Samantha", "Bob");
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();
        System.out.println("Names longer than 5 chars: " + count);
    }
}
