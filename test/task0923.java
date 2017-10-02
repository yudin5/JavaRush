//package com.javarush.task.task09.task0923;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/

public class task0923 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //вводим строку текста
        String line = reader.readLine();
        //разбиваем строку на массив символов
        char[] array = line.toCharArray();

        //проходим по всему массиву символов и проверяем гласная ли это буква
        for (char symbol : array) {
            if (isVowel(symbol)) { //если это гласная, то выводим её на печать + пробел
                System.out.print(symbol + " ");
            }
        }
        System.out.println();
        for (char symbol : array) { //опять проходимся по массиву
                if (!isVowel(symbol) && (symbol != 32)) { //на этот раз делаем то же самое, но только выводим все оставшиеся
                System.out.print(symbol + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}