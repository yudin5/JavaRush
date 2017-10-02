//package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Только для богачей
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class task0818 {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов", 1000);
        map.put("Ивано", 800);
        map.put("Иван", 501);
        map.put("Ива", 500);
        map.put("Петров", 499);
        map.put("Петро", 350);
        map.put("Петр", 200);
        map.put("Сидоров", 450);
        map.put("Кузнецов", 2000);
        map.put("Стулов", 1985);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            if ((Integer)pair.getValue() < 500) it.remove();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> smap = createMap();
        System.out.println(smap);
        System.out.println();

        removeItemFromMap(smap);
        System.out.println(smap);
    }
}