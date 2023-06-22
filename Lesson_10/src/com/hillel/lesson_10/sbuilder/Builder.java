package com.hillel.lesson_10.sbuilder;

public class Builder {

    public static void main(String[] args) {
        int i1 = 3, i2 = 56, i3 = 59, i4 = 53, i5 = 168;
        char c1 = '+', c2 = '=', c3 = '-', c4 = '*', c5 = '.';
        String space = " ";

        StringBuilder str1 = new StringBuilder();
        str1.append(i1);
        str1.append(space);
        str1.append(c1);
        str1.append(space);
        str1.append(i2);
        str1.append(space);
        str1.append(c2);
        str1.append(space);
        str1.append(i3);
        System.out.println(str1);
        System.out.println();

        StringBuilder str2 = new StringBuilder();
        str2.append(i1);
        str2.append(space);
        str2.append(c3);
        str2.append(space);
        str2.append(i2);
        str2.append(space);
        str2.append(c2);
        str2.append(space);
        str2.append(c3);
        str2.append(i4);
        System.out.println(str2);
        System.out.println();

        StringBuilder str3 = new StringBuilder();
        str3.append(i1);
        str3.append(space);
        str3.append(c4);
        str3.append(space);
        str3.append(i2);
        str3.append(space);
        str3.append(c2);
        str3.append(space);
        str3.append(i5);
        str3.append(c5);
        System.out.println(str3);
        System.out.println();

        int location = str1.indexOf("=");
        str1.deleteCharAt(location);
        str1.insert(location, "equals");
        System.out.println(str1);
        System.out.println();

        str2.replace(location, location + 1, "equals");
        System.out.println(str2);
        System.out.println();

        str3.replace(location, location +1, "equals");
        System.out.println(str3);
    }
}
