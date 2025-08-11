package com.learn;

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        ArrayDeque<String> chat = new ArrayDeque<>();

        addMessage(chat, "Hi");
        addMessage(chat, "How are you?");
        addMessage(chat, "What's up?");
        addMessage(chat, "See you soon!");
        addMessage(chat, "Take care");

        System.out.println("Last 4 Messages: " + chat);
    }

    static void addMessage(ArrayDeque<String> chat, String msg) {
        if (chat.size() == 4)
            chat.removeFirst();
        chat.addLast(msg);
    }
}
