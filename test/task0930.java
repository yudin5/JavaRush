//package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам
Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию.
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.
*/

public class task0930 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //пользовательский ввод
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        //вывод отсортированного списка
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        //сначала проходим по всем числам массива и применяем пузырьковую сортировку
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) { //если это число, то проходим по всем элементам массива до i-го в поисках числа
                for (int j = 0; j < i; j++) {
                    if (isNumber(array[j])) { //если число, то сравниваем с i-м и при необходимости, меняем местами
                        if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                            String tmp = array[j];
                            array[j] = array[i];
                            array[i] = tmp;
                        }
                    }
                }
            }
            else { //если это не число, то также проходим по всем элементам массива до i-го в поисках НЕ числа
                for (int j = 0; j < i; j++) {
                    if (!isNumber(array[j])) { //в случае если НЕ число, то сравниваем строки методом isGreaterThan. При необходимости меняем местами.
                        if (isGreaterThan(array[j], array[i])) {
                            String tmp = array[j];
                            array[j] = array[i];
                            array[i] = tmp;
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
