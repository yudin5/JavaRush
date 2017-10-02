//package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и добавлять их в список.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class task0711 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //вводим 5 строк с клавиатуры
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        //13 раз удаляем последнюю строку и вставляем её в начало
        for (int i = 0; i < 13; i++) {
            String change = list.get(list.size()-1); //копируем последюю строку из списка и присваиваем её переменной change
            list.add(0, change); //ставим в начало последнюю строку
            list.remove(list.size()-1); //удаляем последнюю строку из списка
        }

        //выведем новый список на экран
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
