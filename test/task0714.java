//package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Слова в обратном порядке
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент массива.
4. Выведи элементы на экран.
5. Порядок вывода должен быть обратный.
*/

public class task0714 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //вводим 5 строк
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        //удаляем 3-й элемент массива
        list.remove(2);
        //выводим элементы в обратном порядке
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size()-i-1));
        }
    }
}


