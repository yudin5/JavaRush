//package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Продолжаем мыть раму
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
*/

public class task0715 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        //добавляем после каждого слова слово "именно"
        for (int i = 1; i <= list.size(); i += 2) {
            list.add(i, "именно");
        }
        //выводим на экран
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
