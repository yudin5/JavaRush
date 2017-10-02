package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data;
        //Создаем мапу HashMap<Ключ, Значение>. Ключ - это байт, Значение - это количество повторов.
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        while(fileInputStream.available() > 0) {
            data = fileInputStream.read(); //считываем байт
            Integer i = hm.get(data); //запрашиваем мапу на предмет такого байта. data - это ключ. i = количество
            hm.put(data, i == null ? 0 : i + 1); //если i = null (то есть нет такого байта ещё в нашей мапе), то ставим 1, а если уже есть, то инкрементируем
        }

        fileInputStream.close();

        //Выбираем все значения, то есть количества повторов, чтобы найти минимум.
        int min = 0;
        for (int value : hm.values()) {
            if (value < min) min = value;
        }

        //Выводим на экран байты. Для этого из мапы печатаем все Ключи по Значению = max.
        for (Map.Entry<Integer, Integer> pair : hm.entrySet()) {
            if (min == pair.getValue()) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
