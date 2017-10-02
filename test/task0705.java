//package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class task0705 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i < 10) //если индекс меньше 10, то записываем в первый массив
                array1[i] = array[i];
            else //иначе - во второй
                array2[i-10] = array[i];
        }

        //выводим на экран
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
