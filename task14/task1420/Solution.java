package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //вводим 2 числа
        String strA = reader.readLine();
        String strB = reader.readLine();

            //пытаемся их распарсить
            int a = Integer.parseInt(strA);
            int b = Integer.parseInt(strB);

            if (a <= 0) throw new Exception();
            if (b <= 0) throw new Exception();

            //для удобства примем, что a > b. Если не так, то поменяем их местами.
            if (Math.abs(a) < Math.abs(b)) { int c = b; b = a; a = c; }

            //находим остаток от деления
            int tmp = a % b;

            //продолжаем алгоритм Евклида до тех пор, пока остаток не станет равным нулю
            while(tmp != 0) {
                a = b;
                b = tmp;
                tmp = a % b;
            }

            System.out.println(b);

    }
}
