package com.learn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Deque<String> searchBox = new ArrayDeque<>();

        System.out.println("Enter terms to search:");
        while (true) {
            String term = sc.nextLine();
            if (term.equalsIgnoreCase("exit")) break;

            if (searchBox.size() == 3) {
                searchBox.pollFirst(); 
            }
            searchBox.addLast(term);
        }

        System.out.println("Last 3 searches:");
        for (String term : searchBox) {
            System.out.println(term);
        }
	}
}
