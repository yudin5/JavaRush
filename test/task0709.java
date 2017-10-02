//package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/

public class task0709 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        //вводим строки
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        //ищем минимальну длину строки в списке
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min)
                min = list.get(i).length();
        }

        //теперь проходим по списку и если длина строки равна миним, то печатаем её
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
