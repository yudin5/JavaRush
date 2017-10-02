//package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class task0706 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int nechet = 0; //число жителей в НЕчетных
        int chet = 0; //число жителей в четных

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0)
                chet += array[i];
            else
                nechet += array[i];
        }

        System.out.println("Нечет " + nechet);
        System.out.println("Чет " + chet);

        if (nechet > chet)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
