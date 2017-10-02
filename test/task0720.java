//package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
*/

public class task0720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        //считываем числа N и M
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        //считываем N строк и добавляем их в список
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        //берем 1-й элемент, переносим его в конец. Затем удаляем его. Так повторяем M раз. В итоге M первых элементов помещаются в конец списка.
        for (int i = 0; i < M; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
/*
Интересный момент. Метод remove() возвращает удаляемое значение, поэтому перенос в конец списка можно сделать за одно действие:
list.add(list.remove(0));
 */

        //выводим новый список
        for (String s : list) System.out.println(s);
    }
}
