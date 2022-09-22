package com.codewithDeepak;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int myAge = 30;
        byte age = 45;
        long viewsCount = 3_123_456_789L;
        float price = 10.9998F;
        int herAge = myAge;
        Date now = new Date(); // instance of date class// ref types new mem allocation
        long nowww = now.getTime();
        //point object
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("y:"+y);

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        // here p1 and p2 ref the exact same mem location stored in p1- ref type..
        // where as primitive copies values.
        p1.y = 4;
        System.out.println(p2);
        String message = new String("Hello World is yours!!");
        String data = "       Hello, World is yours " + "Deepak       ";
        System.out.println("Ends with Deepak? " +data.startsWith("Deepak"));
        System.out.println(data.replace("D","P"));
        System.out.println(data);
        System.out.println(data.toLowerCase());
        System.out.println(data.toUpperCase());
        System.out.println("src\nhome\tDesktop\\file1");
        System.out.println(data.trim());
        System.out.println("Hello World!! \"DEEPAK\"");
        System.out.println("Index of Z " +data.indexOf("z"));
        System.out.println("Number of characters: " +data.length());
        System.out.println(now);
        System.out.println("Views: "+viewsCount);
        System.out.println("Price: "+price);

    }
}
