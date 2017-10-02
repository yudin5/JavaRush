package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();

        //отсекаем всё, что идет до знака вопроса ("?"), так как оно нам не нужно
        int q = URL.indexOf("?");
        //System.out.println(q);
        String line = URL.substring(q+1);
        //System.out.println(line);
        //System.out.println();

        //теперь разбиваем на отдельные блоки с сепаратором "&"
        String[] words = line.split("&");

        //проходимся по всем этим параметрам и проверяем, содержит ли выражение знак равенства "="
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("="))
                words[i] = words[i].substring(0, words[i].indexOf("="));  //если выражение содержит "=", то отсекаем правую половину
        }

        //выводим на печать полученные значения
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();

        //если содержит "obj"
        if (URL.contains("obj")) {
            String lineWithObj = URL.substring(URL.indexOf("obj")+4); //отсекаем всё до obj
            //System.out.println(lineWithObj);
            String objNumber = lineWithObj.substring(0, lineWithObj.indexOf("&")); //отсекаем всё, кроме числа
            //System.out.println(objNumber);

            try {
                double value = Double.parseDouble(objNumber);
                alert(value);
            } catch (Exception e) {
                alert(objNumber);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
