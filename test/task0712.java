//package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class task0712 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //вводим 10 строк с клавиатуры
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        //ищем максимальную длину строки в списке
        int max = list.get(0).length();
        int min = list.get(0).length();
        int indexMin = 0; //индекс первой минимальной строки
        int indexMax = 0; //индекс второй минимальной строки

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                indexMax = i;
            }
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                indexMin = i;
            }
        }

        //выводим то, что встретилось первым
        if (indexMax < indexMin)
            System.out.println(list.get(indexMax));
        else
            System.out.println(list.get(indexMin));
    }
}
