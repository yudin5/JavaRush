package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

            if (args.length == 0) throw new IllegalArgumentException();

            //Открываем поток для чтения
            FileInputStream inputStream = new FileInputStream(args[0]);

            //Key(Character) - символ, Value(Integer) - частота
            TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

            while(inputStream.available() > 0) {
                char ch = (char) inputStream.read();
                if (map.containsKey(ch)) {
                    map.replace(ch, map.get(ch) + 1);
                } else
                    map.put(ch, 1);
            }

            //Закрываем поток
            inputStream.close();

            //Выводим на консоль
            for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }

    }
}
