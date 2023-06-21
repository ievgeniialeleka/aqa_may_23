package com.hillel.lesson_9;


public class Homework9 {

    public static void printString(String s) {
        System.out.println(s);
    }
    public static void getLastChar(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }
    public static void checkEndSubstring(String s) {
        System.out.println(s.endsWith("!!!"));
    }
    public static void checkStartSubstring(String s) {
        System.out.println(s.startsWith("I like"));
    }
    public static void checkIfStringContainsSubstring(String s) {
        System.out.println(s.contains("Java"));
    }
    public static void getIndexOfSubstring(String s) {
        System.out.println(s.indexOf("Java"));
    }

    public static void replaceCharacters(String s) {
        System.out.println(s.replace('a', 'o'));
    }

    public static void convertToUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void convertToLowerCase(String s) {
        System.out.println(s.toLowerCase());

    }
    public static void getSubstring(String s) {
        System.out.println(s.substring(7, 11));
    }

    public static void getStudentsList(String lastname, int grade, String subject) {
        System.out.println(String.format("Студент %-15s получил %-3d по %-10s", lastname, grade, subject));
    }

    public static String getStringWithMinDistinctCharacters(String s) {
        String[] sArr = s.split(" ");
        int max = 1;
        int count = 1;
        String result = null;
        for (int i = 0; i < sArr.length; i++) {
            char[] arrchar = sArr[i].toCharArray();
            for (int j = 0; j < arrchar.length - 1; j++) {
                if(arrchar[j] == arrchar[j+1]) {
                    count++;
                    if(count > max) {
                        max = count;
                        result = sArr[i];
                    }
                }
            }
        } return result;

    }

        public static void main (String[]args){

        String s = "I like Java!!!";
        printString(s);
        getLastChar(s);
        checkEndSubstring(s);
        checkStartSubstring(s);
        checkIfStringContainsSubstring(s);
        getIndexOfSubstring(s);
        replaceCharacters(s);
        convertToUpperCase(s);
        convertToLowerCase(s);
        getSubstring(s);

        System.out.println();

        getStudentsList("Иванов", 5, "Математике");
        getStudentsList("Петрова", 4, "Физике");
        getStudentsList("Сидорова", 3, "Программированию");

        System.out.println();

        System.out.println(getStringWithMinDistinctCharacters("fffff ab f 1234 jkjk"));
        }
    }
