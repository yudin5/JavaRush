//package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Модернизация ПО
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.
*/

public class task0829 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> cities = new ArrayList<String>();
        List<String> families = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            families.add(family); //вносим фамилию

            String city = reader.readLine();
            cities.add(city); //и город
        }

        //запрашиваем фамилию
        String familyReq = reader.readLine();
        //если фамилия есть в списке, то выводим город, который ей соответствует
        if (families.contains(familyReq)) {
            System.out.println(cities.get(families.indexOf(familyReq)));
        }
        else {
            System.out.println("Такой фамилии в списке нет");
        }
    }
}
