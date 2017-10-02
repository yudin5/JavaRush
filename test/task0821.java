//package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
4. В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
5. В методе createPeopleList() должны добавляться люди с одинаковыми именами.
6. Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7. Метод main() должен вызывать метод createPeopleList().
8. Метод main() должен вызывать метод printPeopleList().
*/

public class task0821 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Иванов", "Алексей");
        map.put("Иванов", "Петр");
        map.put("Иванов", "Степан");
        map.put("Петров", "Ираклий");
        map.put("Петров", "Андрей");
        map.put("Петросян", "Владимир");
        map.put("Сидоров", "Андрей");
        map.put("Кузнецов", "Алексей");
        map.put("Стулов", "Андрей");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
