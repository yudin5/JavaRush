//package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Самая длинная строка
Требования:
1. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class task0708 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        //вводим строки
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        //ищем максимальную длину строки в списке
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max)
                max = list.get(i).length();
        }

        //теперь проходим по списку и если длина строки равна макс, то печатаем её
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max)
                System.out.println(list.get(i));
        }
    }
}
