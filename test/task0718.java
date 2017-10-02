//package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class task0718 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        //проходим по списку и ищем первый элемент, нарушающий упорядоченность
        for (int i = 0; i < list.size(); i++) {
            if ( (list.get(i).length()) > (list.get(i+1).length()) ) {
                System.out.println(i+1);
                break;
            } else if (i == list.size()-2) {
                break;
            }
        }
    }
}

