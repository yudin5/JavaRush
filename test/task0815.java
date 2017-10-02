//package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/*
Перепись населения
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class task0815 {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Ивано", "Алексей");
        map.put("Иван", "Петр");
        map.put("Ива", "Степан");
        map.put("Петров", "Ираклий");
        map.put("Петро", "Андрей");
        map.put("Петр", "Владимир");
        map.put("Сидоров", "Андрей");
        map.put("Кузнецов", "Александр");
        map.put("Стулов", "Андрей");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int repeat = 0;

        for (String imya : map.values()) {
            if (imya.equals(name)) repeat++;
        }
        return repeat;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int repeat = 0;

        for (String familiya : map.keySet()) {
            if (familiya.equals(lastName)) repeat++;
        }
        return repeat;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameLastName(map, "Иванов"));
        System.out.println(map);
    }
}
