package com.learn;

import java.util.Optional;

public class Assignment2 {
    public static Optional<Integer> divide(int a, int b) {
        return b == 0 ? Optional.empty() : Optional.of(a / b);
    }

    public static void main(String[] args) {
        Optional<Integer> result = divide(10, 0);
        System.out.println(result.orElseThrow(() -> new RuntimeException("Not Allowed")));
    }
}
