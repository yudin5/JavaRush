//package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
В убывающем порядке
Требования:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. Метод main должен вызывать метод sort.
4. Метод sort должен сортировать переданный массив по убыванию.
*/

public class task0728 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }

    }

    public static void sort(int[] array) {
                //напишите тут ваш код
                /*Внешний цикл каждый раз сокращает фрагмент массива,
                так как внутренний цикл каждый раз ставит в конец
                фрагмента максимальный элемент*/
            for(int i = array.length-1 ; i > 0 ; i--) {
                for (int j = 0; j < i; j++) {
                    /*Сравниваем элементы попарно,
                    если они имеют неправильный порядок,
                    то меняем местами*/
                    if (array[j] < array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
    }
}
