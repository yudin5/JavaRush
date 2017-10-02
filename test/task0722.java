//package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
3. Саму строку "end" не нужно добавлять в список.
4. Выведи список на экран, каждое значение с новой строки.
5. Используй цикл for.
*/

public class task0722 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        boolean isEnd = false;

        //вводить строки и добавлять и в список, пока не введено слово "end"
        while (!isEnd) {
            String s = reader.readLine();
            if (s.equals("end"))
                isEnd = true;
            else
                list.add(s);
        }
        //выводим список на экран
        for (String s : list) System.out.println(s);
    }
}