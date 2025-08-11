package com.learn;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter 4 tasks:");
        for(int i = 0; i < 4; i++) {
            String task = sc.nextLine();
            if(task.endsWith("!")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        System.out.println("Tasks in reverse order:");
        ListIterator<String> itr = tasks.listIterator(tasks.size());
        while(itr.hasPrevious()) {
            System.out.print(itr.previous()+" ");
        }
	}
}
