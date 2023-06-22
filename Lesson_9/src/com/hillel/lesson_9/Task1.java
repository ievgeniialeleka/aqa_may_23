package com.hillel.lesson_9;

public class Task1 {

    public static void playWithString(String s) {
        System.out.println(s);
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(7, 11));
    }

    public static void main(String[] args) {
        playWithString("I like Java!!!");
    }
}

