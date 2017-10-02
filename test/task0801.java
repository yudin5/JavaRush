//package com.javarush.task.task08.task0801;

/*
HashSet из растений
Требования:
1. Объяви переменную коллекции HashSet с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

import java.util.HashSet;

public class task0801 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();

        //добавляем значения
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //выводим на экран содержимое множества
        for (String s : set) System.out.println(s);
    }
}