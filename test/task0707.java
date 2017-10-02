//package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/*
Что за список такой?
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список. Строки придумай сам.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

public class task0707 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //создаем список
        ArrayList<String> list = new ArrayList();

        //добавляем строки
        String s1 = "Привет";
        list.add(s1);

        String s2 = "Пока";
        list.add(s2);

        String s3 = "Как жизнь?";
        list.add(s3);

        String s4 = "Хорошо";
        list.add(s4);

        String s5 = "Пойдёт";
        list.add(s5);

        //выводим размер списка
        System.out.println(list.size());

        //выводим содержимое списка
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
