//package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Номер месяца
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна использовать коллекции.
5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
May is 5 month
*/

public class task0828 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //заносим месяцы в список
        List<String> array = new ArrayList<String>();
        array.add("January");
        array.add("February");
        array.add("March");
        array.add("April");
        array.add("May");
        array.add("June");
        array.add("July");
        array.add("August");
        array.add("September");
        array.add("October");
        array.add("November");
        array.add("December");

        //принимаем ввод пользователя
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        //выводим ответ
        if (array.contains(month)) {
            int monthNumber = array.indexOf(month) + 1;
            System.out.println(month + " is " + monthNumber  + " month");
        }
        else {
            System.out.println("Такого месяца не существует");
        }
    }
}
