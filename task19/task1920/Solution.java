package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) throw new IllegalArgumentException();
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
        TreeMap<String, Double> map = new TreeMap<>();

        //Читаем файл, заносим всех в мапу
        while(reader.ready()) {
            String[] parts = reader.readLine().split(" ");
            String name = parts[0];
            double value = Double.parseDouble(parts[1]);
            map.put(name, map.containsKey(name) ? map.get(name) + value : value);
        }

        double maxValue = 0;
        ArrayList<String> richPeople = new ArrayList<>(); //список богачей

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() > maxValue) {
                maxValue = pair.getValue();
                richPeople.clear();
                richPeople.add(pair.getKey());
            } else if (pair.getValue() == maxValue) {
                richPeople.add(pair.getKey());
            }
        }
        fileReader.close();
        for (String el : richPeople) {
            System.out.println(el);
        }
    }
}
