package com.learn;

import java.util.*;

class Patient {
    String name;
    int severity;
    int age;

    Patient(String name, int severity, int age) {
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    public String toString() {
        return name + " (Severity: " + severity + ", Age: " + age + ")";
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity)
                      .thenComparingInt(p -> -p.age)
        );

        pq.add(new Patient("Alice", 3, 60));
        pq.add(new Patient("Bob", 2, 70));
        pq.add(new Patient("Charlie", 2, 65));
        pq.add(new Patient("David", 1, 50));
        pq.add(new Patient("Eva", 4, 30));
        pq.add(new Patient("Frank", 5, 40));

        while (pq.size() > 5) pq.poll();

        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll());
        }
    }
}
