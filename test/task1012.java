//package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Количество букв
Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class task1012 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        //создадим массив, в котором будут храниться количества повторов. Так как у нас букв определенное количество, то можно сразу задать размер.
        int[] arrayRepeat = new int[33];
        //теперь проходимся по всем введенным словам
        for (String s : list) {
            //для каждого слова сравниваем побуквенно все символы
            for (int i = 0; i < s.length(); i++) {
                if (alphabet.contains(s.charAt(i))) { //если список "алфавит" содержит такую букву, то увеличиваем на 1 значение соответствующего элемента arrayRepeat
                   arrayRepeat[alphabet.indexOf(s.charAt(i))] += 1;
                }
            }
        }

        //выводим на печать
        for (int i = 0; i < 33; i++) {
            System.out.println(alphabet.get(i) + " " + arrayRepeat[i]);
        }
    }

}
