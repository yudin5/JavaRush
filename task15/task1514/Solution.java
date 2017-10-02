package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "First");
        labels.put(2.0, "Second");
        labels.put(3.0, "Third");
        labels.put(3.5, "Three with a half");
        labels.put(4.0, "Four");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
