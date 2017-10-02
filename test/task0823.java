//package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.toUpperCase;

/*
Омовение Рамы
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class task0823 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //считываем строку
        String s = reader.readLine();

        char[] chars = s.toCharArray();
        chars[0] = toUpperCase(chars[0]); //1-й символ всегда заглавный
        String newLine = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 32) {
                if (i == chars.length - 1) {
                    newLine += chars[i];
                    break;
                }
                chars[i+1] = toUpperCase(chars[i+1]);
            }
            newLine += chars[i];
        }
        System.out.println(newLine);

/*
        //создаем новую строку, в которую выведем результат работы программы
        String newLine = "";

        //сразу делаем заглавной первую букву
        newLine = newLine + toUpperCase(s.charAt(0));

        //проходим по всем символам введенной строки
        for (int i = 1; i < s.length(); i++) {
            char next = s.charAt(i);
            if (next == ' ') { //если очередной символ "пробел", то следующую букву делаем прописной и добавляем всё это к newLine
                if (i == s.length()-1) {
                    newLine = newLine + " "; //если это последний символ и это пробел, то выходим
                    break;
                }
                newLine = newLine + next + toUpperCase(s.charAt(i+1));
                i++;//не забываем прибавить к счетчику 1, а то буквы задублируются
            }
            else {
                newLine = newLine + next;
            }
        }
        //выводим новую строку
        System.out.println(newLine);
*/

//ЭФФЕКТНЫЙ ВАРИАНТ
        //for (String sUpp : s.split("\\b")){System.out.print(sUpp.replaceFirst(sUpp.substring(0,1),sUpp.substring(0,1).toUpperCase()));}

    }
}
