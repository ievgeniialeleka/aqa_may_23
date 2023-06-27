package com.hillel.lesson_9;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static String getMinDistinctCahrs(String s) {
        String[] sArr = s.split(" ");
        Set<Character> set = new HashSet<>();
        int min_count = Integer.MAX_VALUE;
        int cur_count = 1;
        String result = null;

        for (int i = 0; i < sArr.length; i++) {
            char[] cArr = sArr[i].toCharArray();
            for (int j = 0; j < cArr.length; j++) {
                set.add(cArr[j]);
                cur_count = set.size();
            }
            if (cur_count == 1) {
                return sArr[i];
            } else if (cur_count < min_count) {
                min_count = cur_count;
                result = sArr[i];
            }
            set.clear();
            cur_count = 1;
        } return result;
    }


    public static void main(String[] args) {

        String s = "fffff ab f 1234 jkjk";
        System.out.println(getMinDistinctCahrs(s));
    }
}
