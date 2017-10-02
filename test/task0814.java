//package com.javarush.task.task08.task0814;

import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/

public class task0814 {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer  >();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

        System.out.println(removeAllNumbersMoreThan10(createSet()));

    }
}
