//package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/

public class task0721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        //присваиваем максимум и минимум первым элементам массива
        maximum = array[0];
        minimum = array[0];
        //проходим по массиву и ищем максимум и минимум
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) minimum = array[i];
            if (array[i] > maximum) maximum = array[i];
        }
        //выводим максимум и минимум на экран через пробел
        System.out.println(maximum + " " + minimum);
    }
}
