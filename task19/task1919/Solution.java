package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) throw new IllegalArgumentException();
        FileReader fileReader = new FileReader(args[0]);
        //FileReader fileReader = new FileReader("C:/data.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        TreeMap<String, Double> map = new TreeMap<>();
        while(reader.ready()) {
            String[] parts = reader.readLine().split(" ");
            String name = parts[0]; //имя
            double salary = Double.parseDouble(parts[1]); //зарплата

            map.put(name, map.containsKey(name) ? map.get(name) + salary : salary);
        }
        fileReader.close();
        //mapPeople.put(family, mapPeople.containsKey(family) ? mapPeople.get(family) + value : value);

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
