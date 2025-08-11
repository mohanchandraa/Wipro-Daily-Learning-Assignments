package com.learn;

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        LinkedList<String> apps = new LinkedList<>();
        openApp(apps, "Instagram");
        openApp(apps, "YouTube");
        openApp(apps, "WhatsApp");
        openApp(apps, "Chrome");
        openApp(apps, "Spotify");
        openApp(apps, "YouTube");
        openApp(apps, "Maps");

        System.out.println("Recent Apps: " + apps);
    }

    static void openApp(LinkedList<String> apps, String app) {
        apps.remove(app);
        apps.addFirst(app);
        if (apps.size() > 5)
            apps.removeLast();
    }
}
